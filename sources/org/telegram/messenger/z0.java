package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final int f18015a;
    public final ResultCallback f18016b;
    public final TLRPC.TL_error f18017c;

    public z0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f18015a = i10;
        this.f18016b = resultCallback;
        this.f18017c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18015a) {
            case 0:
                this.f18016b.onError(this.f18017c);
                return;
            default:
                this.f18016b.onError(this.f18017c);
                return;
        }
    }
}
