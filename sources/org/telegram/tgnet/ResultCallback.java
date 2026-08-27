package org.telegram.tgnet;

public interface ResultCallback<T> {
    void onComplete(T t10);

    void onError(Throwable th);

    void onError(TLRPC.TL_error tL_error);
}
