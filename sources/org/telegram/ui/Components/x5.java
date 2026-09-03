package org.telegram.ui.Components;
public final class x5 implements kf.i {
    public final int f30477a;
    public final Object f30478b;

    public x5(Object obj, int i10) {
        this.f30477a = i10;
        this.f30478b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f30477a) {
            case 0:
                y5 y5Var = (y5) this.f30478b;
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
                int i11 = EditTextBoldCursor.f22995a;
                ((EditTextBoldCursor) this.f30478b).invalidate();
                return;
            default:
                gj0.g((gj0) this.f30478b);
                return;
        }
    }
}
