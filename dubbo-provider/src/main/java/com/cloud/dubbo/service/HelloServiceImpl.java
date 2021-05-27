package com.cloud.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author sunny
 * @date: 2021-05-27 23:27
 */
@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "cloud dubbo " + name;
    }
}
