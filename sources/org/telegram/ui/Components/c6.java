package org.telegram.ui.Components;
public final class c6 implements yf.g {
    public final int f23231a;
    public final Object f23232b;

    public c6(Object obj, int i10) {
        this.f23231a = i10;
        this.f23232b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f23231a) {
            case 0:
                d6 d6Var = (d6) this.f23232b;
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
                int i11 = EditTextBoldCursor.f22257a;
                ((EditTextBoldCursor) this.f23232b).invalidate();
                return;
            default:
                kj0.g((kj0) this.f23232b);
                return;
        }
    }
}
