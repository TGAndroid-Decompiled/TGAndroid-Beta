package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zm implements Runnable {
    public final int f28333a;
    public final xo f28334b;
    public final TLRPC.TL_error f28335c;

    public zm(xo xoVar, TLRPC.TL_error tL_error, int i7) {
        this.f28333a = i7;
        this.f28334b = xoVar;
        this.f28335c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f28333a) {
            case 0:
                this.f28334b.e(this.f28335c);
                return;
            default:
                this.f28334b.e(this.f28335c);
                return;
        }
    }
}
