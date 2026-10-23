package org.telegram.ui.Components;
public final class d6 implements zf.g {
    public final int f25506a;
    public final Object f25507b;

    public d6(Object obj, int i10) {
        this.f25506a = i10;
        this.f25507b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f25506a) {
            case 0:
                e6 e6Var = (e6) this.f25507b;
                int i10 = e6Var.Q0 + 1;
                e6Var.Q0 = i10;
                if (i10 > 10) {
                    e6Var.R0 = true;
                }
                e6Var.i();
                if (e6Var.U0) {
                    e6Var.T0 = true;
                    e6Var.t();
                    return;
                }
                return;
            case 1:
                int i11 = EditTextBoldCursor.f24356a;
                ((EditTextBoldCursor) this.f25507b).invalidate();
                return;
            default:
                yj0.g((yj0) this.f25507b);
                return;
        }
    }
}
