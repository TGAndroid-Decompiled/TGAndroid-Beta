package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final int f27916a;
    public final l8 f27917b;
    public final TLRPC.TL_error f27918c;

    public k7(l8 l8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27916a = i10;
        this.f27917b = l8Var;
        this.f27918c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27916a) {
            case 0:
                l8.u(this.f27917b, this.f27918c);
                return;
            case 1:
                l8.y(this.f27917b, this.f27918c);
                return;
            case 2:
                l8.I(this.f27917b, this.f27918c);
                return;
            default:
                l8.J(this.f27917b, this.f27918c);
                return;
        }
    }
}
