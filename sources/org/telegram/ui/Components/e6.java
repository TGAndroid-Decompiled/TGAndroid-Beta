package org.telegram.ui.Components;
public final class e6 implements yf.g {
    public final int f25960a;
    public final Object f25961b;

    public e6(Object obj, int i10) {
        this.f25960a = i10;
        this.f25961b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f25960a) {
            case 0:
                f6 f6Var = (f6) this.f25961b;
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
                int i11 = EditTextBoldCursor.f24161a;
                ((EditTextBoldCursor) this.f25961b).invalidate();
                return;
            default:
                ck0.g((ck0) this.f25961b);
                return;
        }
    }
}
