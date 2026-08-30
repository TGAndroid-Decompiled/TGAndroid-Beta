package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final int f19091a;
    public final ResultCallback f19092b;
    public final TLRPC.TL_error f19093c;

    public z0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f19091a = i10;
        this.f19092b = resultCallback;
        this.f19093c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19091a) {
            case 0:
                this.f19092b.onError(this.f19093c);
                return;
            default:
                this.f19092b.onError(this.f19093c);
                return;
        }
    }
}
