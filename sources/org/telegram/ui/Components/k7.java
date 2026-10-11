package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final int f27853a;
    public final l8 f27854b;
    public final TLRPC.TL_error f27855c;

    public k7(l8 l8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27853a = i10;
        this.f27854b = l8Var;
        this.f27855c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27853a) {
            case 0:
                l8.u(this.f27854b, this.f27855c);
                return;
            case 1:
                l8.y(this.f27854b, this.f27855c);
                return;
            case 2:
                l8.I(this.f27854b, this.f27855c);
                return;
            default:
                l8.J(this.f27854b, this.f27855c);
                return;
        }
    }
}
