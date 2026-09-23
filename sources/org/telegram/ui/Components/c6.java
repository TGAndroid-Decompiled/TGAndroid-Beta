package org.telegram.ui.Components;
public final class c6 implements yf.g {
    public final int f22942a;
    public final Object f22943b;

    public c6(Object obj, int i10) {
        this.f22942a = i10;
        this.f22943b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f22942a) {
            case 0:
                d6 d6Var = (d6) this.f22943b;
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
                int i11 = EditTextBoldCursor.f22003a;
                ((EditTextBoldCursor) this.f22943b).invalidate();
                return;
            default:
                yi0.g((yi0) this.f22943b);
                return;
        }
    }
}
