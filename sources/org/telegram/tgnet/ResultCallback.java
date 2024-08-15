package org.telegram.tgnet;
public interface ResultCallback<T> {

    public final class CC<T> {
        public static void $default$onError(ResultCallback resultCallback, Throwable th) {
        }

        public static void $default$onError(ResultCallback resultCallback, TLRPC$TL_error tLRPC$TL_error) {
        }
    }

    void onComplete(T t);

    void onError(TLRPC$TL_error tLRPC$TL_error);
}
