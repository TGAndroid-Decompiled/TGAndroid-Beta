package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final int f27975a;
    public final l8 f27976b;
    public final TLRPC.TL_error f27977c;

    public k7(l8 l8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27975a = i10;
        this.f27976b = l8Var;
        this.f27977c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27975a) {
            case 0:
                l8.u(this.f27976b, this.f27977c);
                return;
            case 1:
                l8.y(this.f27976b, this.f27977c);
                return;
            case 2:
                l8.I(this.f27976b, this.f27977c);
                return;
            default:
                l8.J(this.f27976b, this.f27977c);
                return;
        }
    }
}
