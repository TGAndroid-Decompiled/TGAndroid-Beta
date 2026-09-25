package org.telegram.ui.Components;
public final class c6 implements yf.g {
    public final int f23209a;
    public final Object f23210b;

    public c6(Object obj, int i10) {
        this.f23209a = i10;
        this.f23210b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f23209a) {
            case 0:
                d6 d6Var = (d6) this.f23210b;
                int i10 = d6Var.Q0 + 1;
                d6Var.Q0 = i10;
                if (i10 > 10) {
                    d6Var.R0 = true;
                }
                d6Var.i();
                if (d6Var.U0) {
                    d6Var.T0 = true;
                    d6Var.t();
                    return;
                }
                return;
            case 1:
                int i11 = EditTextBoldCursor.f22255a;
                ((EditTextBoldCursor) this.f23210b).invalidate();
                return;
            default:
                ij0.g((ij0) this.f23210b);
                return;
        }
    }
}
