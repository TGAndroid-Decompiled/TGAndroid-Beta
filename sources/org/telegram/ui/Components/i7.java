package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f27323a;
    public final j8 f27324b;
    public final TLRPC.TL_error f27325c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27323a = i10;
        this.f27324b = j8Var;
        this.f27325c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27323a) {
            case 0:
                j8.s(this.f27324b, this.f27325c);
                return;
            case 1:
                j8.w(this.f27324b, this.f27325c);
                return;
            case 2:
                j8.F(this.f27324b, this.f27325c);
                return;
            default:
                j8.G(this.f27324b, this.f27325c);
                return;
        }
    }
}
