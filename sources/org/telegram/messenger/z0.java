package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final int f20744a;
    public final ResultCallback f20745b;
    public final TLRPC.TL_error f20746c;

    public z0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f20744a = i10;
        this.f20745b = resultCallback;
        this.f20746c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20744a) {
            case 0:
                this.f20745b.onError(this.f20746c);
                return;
            default:
                this.f20745b.onError(this.f20746c);
                return;
        }
    }
}
