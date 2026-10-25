package org.telegram.ui.Components;
public final class f6 implements ag.m {
    public final int f28067a;
    public final Object f28068b;

    public f6(Object obj, int i10) {
        this.f28067a = i10;
        this.f28068b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f28067a) {
            case 0:
                g6 g6Var = (g6) this.f28068b;
                int i10 = g6Var.Q0 + 1;
                g6Var.Q0 = i10;
                if (i10 > 10) {
                    g6Var.R0 = true;
                }
                g6Var.i();
                if (g6Var.U0) {
                    g6Var.T0 = true;
                    g6Var.t();
                    return;
                }
                return;
            case 1:
                int i11 = EditTextBoldCursor.f26147a;
                ((EditTextBoldCursor) this.f28068b).invalidate();
                return;
            default:
                xj0.g((xj0) this.f28068b);
                return;
        }
    }
}
