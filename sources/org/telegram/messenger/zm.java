package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zm implements Runnable {
    public final int f28425a;
    public final xo f28426b;
    public final TLRPC.TL_error f28427c;

    public zm(xo xoVar, TLRPC.TL_error tL_error, int i7) {
        this.f28425a = i7;
        this.f28426b = xoVar;
        this.f28427c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f28425a) {
            case 0:
                this.f28426b.d(this.f28427c);
                return;
            default:
                this.f28426b.d(this.f28427c);
                return;
        }
    }
}
