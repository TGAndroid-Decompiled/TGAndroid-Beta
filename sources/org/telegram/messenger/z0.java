package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final int f22285a;
    public final ResultCallback f22286b;
    public final TLRPC.TL_error f22287c;

    public z0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i9) {
        this.f22285a = i9;
        this.f22286b = resultCallback;
        this.f22287c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f22285a) {
            case 0:
                this.f22286b.onError(this.f22287c);
                return;
            default:
                this.f22286b.onError(this.f22287c);
                return;
        }
    }
}
