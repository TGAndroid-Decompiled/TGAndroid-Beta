package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f27322a;
    public final j8 f27323b;
    public final TLRPC.TL_error f27324c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27322a = i10;
        this.f27323b = j8Var;
        this.f27324c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27322a) {
            case 0:
                j8.s(this.f27323b, this.f27324c);
                return;
            case 1:
                j8.w(this.f27323b, this.f27324c);
                return;
            case 2:
                j8.F(this.f27323b, this.f27324c);
                return;
            default:
                j8.G(this.f27323b, this.f27324c);
                return;
        }
    }
}
