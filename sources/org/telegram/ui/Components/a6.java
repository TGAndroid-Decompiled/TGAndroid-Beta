package org.telegram.ui.Components;
public final class a6 implements yf.g {
    public final int f22327a;
    public final Object f22328b;

    public a6(Object obj, int i10) {
        this.f22327a = i10;
        this.f22328b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f22327a) {
            case 0:
                b6 b6Var = (b6) this.f22328b;
                int i10 = b6Var.Q0 + 1;
                b6Var.Q0 = i10;
                if (i10 > 10) {
                    b6Var.R0 = true;
                }
                b6Var.i();
                if (b6Var.U0) {
                    b6Var.T0 = true;
                    b6Var.t();
                    return;
                }
                return;
            case 1:
                int i11 = EditTextBoldCursor.f22042a;
                ((EditTextBoldCursor) this.f22328b).invalidate();
                return;
            default:
                yi0.g((yi0) this.f22328b);
                return;
        }
    }
}
