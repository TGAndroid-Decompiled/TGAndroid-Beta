package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final int f18259a;
    public final ResultCallback f18260b;
    public final TLRPC.TL_error f18261c;

    public z0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f18259a = i10;
        this.f18260b = resultCallback;
        this.f18261c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18259a) {
            case 0:
                this.f18260b.onError(this.f18261c);
                return;
            default:
                this.f18260b.onError(this.f18261c);
                return;
        }
    }
}
