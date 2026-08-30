package org.telegram.ui.Components;
public final class x5 implements lf.i {
    public final int f30544a;
    public final Object f30545b;

    public x5(Object obj, int i10) {
        this.f30544a = i10;
        this.f30545b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f30544a) {
            case 0:
                y5 y5Var = (y5) this.f30545b;
                int i10 = y5Var.N0 + 1;
                y5Var.N0 = i10;
                if (i10 > 10) {
                    y5Var.O0 = true;
                }
                y5Var.i();
                if (y5Var.R0) {
                    y5Var.Q0 = true;
                    y5Var.t();
                    return;
                }
                return;
            case 1:
                int i11 = EditTextBoldCursor.f23022a;
                ((EditTextBoldCursor) this.f30545b).invalidate();
                return;
            default:
                gj0.g((gj0) this.f30545b);
                return;
        }
    }
}
