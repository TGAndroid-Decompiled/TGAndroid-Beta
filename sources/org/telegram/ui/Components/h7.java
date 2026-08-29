package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h7 implements Runnable {
    public final int f29083a;
    public final g8 f29084b;
    public final TLRPC.TL_error f29085c;

    public h7(g8 g8Var, TLRPC.TL_error tL_error, int i10) {
        this.f29083a = i10;
        this.f29084b = g8Var;
        this.f29085c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f29083a) {
            case 0:
                g8.s(this.f29084b, this.f29085c);
                return;
            case 1:
                g8.w(this.f29084b, this.f29085c);
                return;
            case 2:
                g8.G(this.f29084b, this.f29085c);
                return;
            default:
                g8.H(this.f29084b, this.f29085c);
                return;
        }
    }
}
