package org.telegram.ui.Components;
public final class b6 implements yf.g {
    public final int f22868a;
    public final Object f22869b;

    public b6(Object obj, int i10) {
        this.f22868a = i10;
        this.f22869b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f22868a) {
            case 0:
                c6 c6Var = (c6) this.f22869b;
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
                int i11 = EditTextBoldCursor.f22269a;
                ((EditTextBoldCursor) this.f22869b).invalidate();
                return;
            default:
                kj0.g((kj0) this.f22869b);
                return;
        }
    }
}
