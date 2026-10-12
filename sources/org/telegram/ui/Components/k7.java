package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final int f27768a;
    public final l8 f27769b;
    public final TLRPC.TL_error f27770c;

    public k7(l8 l8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27768a = i10;
        this.f27769b = l8Var;
        this.f27770c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27768a) {
            case 0:
                l8.u(this.f27769b, this.f27770c);
                return;
            case 1:
                l8.y(this.f27769b, this.f27770c);
                return;
            case 2:
                l8.I(this.f27769b, this.f27770c);
                return;
            default:
                l8.J(this.f27769b, this.f27770c);
                return;
        }
    }
}
