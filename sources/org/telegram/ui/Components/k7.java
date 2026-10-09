package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final int f27863a;
    public final l8 f27864b;
    public final TLRPC.TL_error f27865c;

    public k7(l8 l8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27863a = i10;
        this.f27864b = l8Var;
        this.f27865c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27863a) {
            case 0:
                l8.u(this.f27864b, this.f27865c);
                return;
            case 1:
                l8.y(this.f27864b, this.f27865c);
                return;
            case 2:
                l8.I(this.f27864b, this.f27865c);
                return;
            default:
                l8.J(this.f27864b, this.f27865c);
                return;
        }
    }
}
