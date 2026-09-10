package org.telegram.ui.Components;
public final class b6 implements xf.g {
    public final int f21731a;
    public final Object f21732b;

    public b6(Object obj, int i10) {
        this.f21731a = i10;
        this.f21732b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f21731a) {
            case 0:
                c6 c6Var = (c6) this.f21732b;
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
                int i11 = EditTextBoldCursor.f21117a;
                ((EditTextBoldCursor) this.f21732b).invalidate();
                return;
            default:
                hj0.g((hj0) this.f21732b);
                return;
        }
    }
}
