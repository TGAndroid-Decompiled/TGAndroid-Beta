package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zm implements Runnable {
    public final int f28361a;
    public final xo f28362b;
    public final TLRPC.TL_error f28363c;

    public zm(xo xoVar, TLRPC.TL_error tL_error, int i7) {
        this.f28361a = i7;
        this.f28362b = xoVar;
        this.f28363c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f28361a) {
            case 0:
                this.f28362b.e(this.f28363c);
                return;
            default:
                this.f28362b.e(this.f28363c);
                return;
        }
    }
}
