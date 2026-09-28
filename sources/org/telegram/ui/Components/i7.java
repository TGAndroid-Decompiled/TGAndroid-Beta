package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f25016a;
    public final j8 f25017b;
    public final TLRPC.TL_error f25018c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f25016a = i10;
        this.f25017b = j8Var;
        this.f25018c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f25016a) {
            case 0:
                j8.s(this.f25017b, this.f25018c);
                return;
            case 1:
                j8.w(this.f25017b, this.f25018c);
                return;
            case 2:
                j8.H(this.f25017b, this.f25018c);
                return;
            default:
                j8.I(this.f25017b, this.f25018c);
                return;
        }
    }
}
