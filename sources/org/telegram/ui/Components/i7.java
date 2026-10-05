package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f27413a;
    public final j8 f27414b;
    public final TLRPC.TL_error f27415c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27413a = i10;
        this.f27414b = j8Var;
        this.f27415c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27413a) {
            case 0:
                j8.s(this.f27414b, this.f27415c);
                return;
            case 1:
                j8.w(this.f27414b, this.f27415c);
                return;
            case 2:
                j8.F(this.f27414b, this.f27415c);
                return;
            default:
                j8.G(this.f27414b, this.f27415c);
                return;
        }
    }
}
