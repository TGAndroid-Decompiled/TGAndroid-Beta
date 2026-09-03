package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final int f19066a;
    public final ResultCallback f19067b;
    public final TLRPC.TL_error f19068c;

    public z0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f19066a = i10;
        this.f19067b = resultCallback;
        this.f19068c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19066a) {
            case 0:
                this.f19067b.onError(this.f19068c);
                return;
            default:
                this.f19067b.onError(this.f19068c);
                return;
        }
    }
}
