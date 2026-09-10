package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f23916a;
    public final j8 f23917b;
    public final TLRPC.TL_error f23918c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f23916a = i10;
        this.f23917b = j8Var;
        this.f23918c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f23916a) {
            case 0:
                j8.s(this.f23917b, this.f23918c);
                return;
            case 1:
                j8.w(this.f23917b, this.f23918c);
                return;
            case 2:
                j8.H(this.f23917b, this.f23918c);
                return;
            default:
                j8.I(this.f23917b, this.f23918c);
                return;
        }
    }
}
