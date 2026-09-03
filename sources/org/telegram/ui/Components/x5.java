package org.telegram.ui.Components;
public final class x5 implements lf.i {
    public final int f32950a;
    public final Object f32951b;

    public x5(Object obj, int i10) {
        this.f32950a = i10;
        this.f32951b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f32950a) {
            case 0:
                y5 y5Var = (y5) this.f32951b;
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
                int i11 = EditTextBoldCursor.f24872a;
                ((EditTextBoldCursor) this.f32951b).invalidate();
                return;
            default:
                hj0.g((hj0) this.f32951b);
                return;
        }
    }
}
