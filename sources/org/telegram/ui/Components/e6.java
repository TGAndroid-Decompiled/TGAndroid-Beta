package org.telegram.ui.Components;
public final class e6 implements yf.g {
    public final int f25875a;
    public final Object f25876b;

    public e6(Object obj, int i10) {
        this.f25875a = i10;
        this.f25876b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f25875a) {
            case 0:
                f6 f6Var = (f6) this.f25876b;
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
                int i11 = EditTextBoldCursor.f24153a;
                ((EditTextBoldCursor) this.f25876b).invalidate();
                return;
            default:
                ek0.g((ek0) this.f25876b);
                return;
        }
    }
}
