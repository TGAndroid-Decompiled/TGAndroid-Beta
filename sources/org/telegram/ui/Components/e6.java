package org.telegram.ui.Components;
public final class e6 implements zf.h {
    public final int f24617a;
    public final Object f24618b;

    public e6(Object obj, int i10) {
        this.f24617a = i10;
        this.f24618b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f24617a) {
            case 0:
                f6 f6Var = (f6) this.f24618b;
                int i10 = f6Var.Q0 + 1;
                f6Var.Q0 = i10;
                if (i10 > 10) {
                    f6Var.R0 = true;
                }
                f6Var.i();
                if (f6Var.U0) {
                    f6Var.T0 = true;
                    f6Var.t();
                    return;
                }
                return;
            case 1:
                int i11 = EditTextBoldCursor.f23152a;
                ((EditTextBoldCursor) this.f24618b).invalidate();
                return;
            default:
                yj0.g((yj0) this.f24618b);
                return;
        }
    }
}
