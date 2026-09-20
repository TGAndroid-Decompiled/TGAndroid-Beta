package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final int f18244a;
    public final ResultCallback f18245b;
    public final TLRPC.TL_error f18246c;

    public z0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f18244a = i10;
        this.f18245b = resultCallback;
        this.f18246c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18244a) {
            case 0:
                this.f18245b.onError(this.f18246c);
                return;
            default:
                this.f18245b.onError(this.f18246c);
                return;
        }
    }
}
