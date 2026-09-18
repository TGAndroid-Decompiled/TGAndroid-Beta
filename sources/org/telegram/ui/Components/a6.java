package org.telegram.ui.Components;
public final class a6 implements yf.g {
    public final int f22330a;
    public final Object f22331b;

    public a6(Object obj, int i10) {
        this.f22330a = i10;
        this.f22331b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f22330a) {
            case 0:
                b6 b6Var = (b6) this.f22331b;
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
                int i11 = EditTextBoldCursor.f22045a;
                ((EditTextBoldCursor) this.f22331b).invalidate();
                return;
            default:
                yi0.g((yi0) this.f22331b);
                return;
        }
    }
}
