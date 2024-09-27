package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

public interface ResultCallback<T> {

    public abstract class CC {
        public static void $default$onError(ResultCallback resultCallback, Throwable th) {
        }

        public static void $default$onError(ResultCallback resultCallback, TLRPC.TL_error tL_error) {
        }
    }

    void onComplete(T t);

    void onError(Throwable th);

    void onError(TLRPC.TL_error tL_error);
}
