package org.telegram.ui.Components;
public final class c6 implements yf.g {
    public final int f23216a;
    public final Object f23217b;

    public c6(Object obj, int i10) {
        this.f23216a = i10;
        this.f23217b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f23216a) {
            case 0:
                d6 d6Var = (d6) this.f23217b;
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
                int i11 = EditTextBoldCursor.f22254a;
                ((EditTextBoldCursor) this.f23217b).invalidate();
                return;
            default:
                jj0.g((jj0) this.f23217b);
                return;
        }
    }
}
