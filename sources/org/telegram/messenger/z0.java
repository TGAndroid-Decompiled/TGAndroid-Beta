package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final int f20742a;
    public final ResultCallback f20743b;
    public final TLRPC.TL_error f20744c;

    public z0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f20742a = i10;
        this.f20743b = resultCallback;
        this.f20744c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20742a) {
            case 0:
                this.f20743b.onError(this.f20744c);
                return;
            default:
                this.f20743b.onError(this.f20744c);
                return;
        }
    }
}
