package org.telegram.ui.Components;
public final class b6 implements zf.g {
    public final int f24913a;
    public final Object f24914b;

    public b6(Object obj, int i10) {
        this.f24913a = i10;
        this.f24914b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f24913a) {
            case 0:
                c6 c6Var = (c6) this.f24914b;
                int i10 = c6Var.Q0 + 1;
                c6Var.Q0 = i10;
                if (i10 > 10) {
                    c6Var.R0 = true;
                }
                c6Var.i();
                if (c6Var.U0) {
                    c6Var.T0 = true;
                    c6Var.t();
                    return;
                }
                return;
            case 1:
                int i11 = EditTextBoldCursor.f24357a;
                ((EditTextBoldCursor) this.f24914b).invalidate();
                return;
            default:
                xj0.g((xj0) this.f24914b);
                return;
        }
    }
}
