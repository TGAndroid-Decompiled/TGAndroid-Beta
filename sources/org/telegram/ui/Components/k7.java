package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final int f27771a;
    public final l8 f27772b;
    public final TLRPC.TL_error f27773c;

    public k7(l8 l8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27771a = i10;
        this.f27772b = l8Var;
        this.f27773c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27771a) {
            case 0:
                l8.u(this.f27772b, this.f27773c);
                return;
            case 1:
                l8.y(this.f27772b, this.f27773c);
                return;
            case 2:
                l8.I(this.f27772b, this.f27773c);
                return;
            default:
                l8.J(this.f27772b, this.f27773c);
                return;
        }
    }
}
