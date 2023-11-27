package com.example.processorwebflux.processor;

public interface DataProcessor<T> {

    T process(T data);
}