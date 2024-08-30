package org.telegram.tgnet;

public interface ResultCallback {

    public abstract class CC {
        public static void $default$onError(ResultCallback resultCallback, Throwable th) {
        }

        public static void $default$onError(ResultCallback resultCallback, TLRPC$TL_error tLRPC$TL_error) {
        }
    }

    void onComplete(Object obj);

    void onError(Throwable th);

    void onError(TLRPC$TL_error tLRPC$TL_error);
}
