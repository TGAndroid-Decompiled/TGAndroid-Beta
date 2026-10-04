package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f27328a;
    public final j8 f27329b;
    public final TLRPC.TL_error f27330c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27328a = i10;
        this.f27329b = j8Var;
        this.f27330c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27328a) {
            case 0:
                j8.s(this.f27329b, this.f27330c);
                return;
            case 1:
                j8.w(this.f27329b, this.f27330c);
                return;
            case 2:
                j8.F(this.f27329b, this.f27330c);
                return;
            default:
                j8.G(this.f27329b, this.f27330c);
                return;
        }
    }
}
