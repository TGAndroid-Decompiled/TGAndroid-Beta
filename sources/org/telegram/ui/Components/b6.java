package org.telegram.ui.Components;
public final class b6 implements yf.g {
    public final int f22902a;
    public final Object f22903b;

    public b6(Object obj, int i10) {
        this.f22902a = i10;
        this.f22903b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f22902a) {
            case 0:
                c6 c6Var = (c6) this.f22903b;
                int i10 = c6Var.Q0 + 1;
                c6Var.Q0 = i10;
                if (i10 > 10) {
                    c6Var.R0 = true;
                }
                c6Var.i();
                if (c6Var.U0) {
                    c6Var.T0 = true;
                    c6Var.t();
                    return;
                }
                return;
            case 1:
                int i11 = EditTextBoldCursor.f22253a;
                ((EditTextBoldCursor) this.f22903b).invalidate();
                return;
            default:
                hj0.g((hj0) this.f22903b);
                return;
        }
    }
}
