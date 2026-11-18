package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zm implements Runnable {
    public final int f28335a;
    public final xo f28336b;
    public final TLRPC.TL_error f28337c;

    public zm(xo xoVar, TLRPC.TL_error tL_error, int i7) {
        this.f28335a = i7;
        this.f28336b = xoVar;
        this.f28337c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f28335a) {
            case 0:
                this.f28336b.e(this.f28337c);
                return;
            default:
                this.f28336b.e(this.f28337c);
                return;
        }
    }
}
