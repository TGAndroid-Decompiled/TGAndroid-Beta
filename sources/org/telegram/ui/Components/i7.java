package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f24988a;
    public final j8 f24989b;
    public final TLRPC.TL_error f24990c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24988a = i10;
        this.f24989b = j8Var;
        this.f24990c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24988a) {
            case 0:
                j8.s(this.f24989b, this.f24990c);
                return;
            case 1:
                j8.w(this.f24989b, this.f24990c);
                return;
            case 2:
                j8.H(this.f24989b, this.f24990c);
                return;
            default:
                j8.I(this.f24989b, this.f24990c);
                return;
        }
    }
}
