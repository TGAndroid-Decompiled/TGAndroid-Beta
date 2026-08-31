package org.telegram.ui.Components;
public final class x5 implements lf.i {
    public final int f32951a;
    public final Object f32952b;

    public x5(Object obj, int i10) {
        this.f32951a = i10;
        this.f32952b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f32951a) {
            case 0:
                y5 y5Var = (y5) this.f32952b;
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
                int i11 = EditTextBoldCursor.f24870a;
                ((EditTextBoldCursor) this.f32952b).invalidate();
                return;
            default:
                ij0.g((ij0) this.f32952b);
                return;
        }
    }
}
