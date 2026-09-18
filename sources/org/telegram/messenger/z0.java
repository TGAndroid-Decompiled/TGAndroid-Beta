package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final int f18201a;
    public final ResultCallback f18202b;
    public final TLRPC.TL_error f18203c;

    public z0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f18201a = i10;
        this.f18202b = resultCallback;
        this.f18203c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18201a) {
            case 0:
                this.f18202b.onError(this.f18203c);
                return;
            default:
                this.f18202b.onError(this.f18203c);
                return;
        }
    }
}
