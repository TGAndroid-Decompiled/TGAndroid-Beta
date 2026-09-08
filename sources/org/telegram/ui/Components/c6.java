package org.telegram.ui.Components;
public final class c6 implements yf.g {
    public final int f24930a;
    public final Object f24931b;

    public c6(Object obj, int i10) {
        this.f24930a = i10;
        this.f24931b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f24930a) {
            case 0:
                d6 d6Var = (d6) this.f24931b;
                int i10 = d6Var.Q0 + 1;
                d6Var.Q0 = i10;
                if (i10 > 10) {
                    d6Var.R0 = true;
                }
                d6Var.i();
                if (d6Var.U0) {
                    d6Var.T0 = true;
                    d6Var.t();
                    return;
                }
                return;
            case 1:
                int i11 = EditTextBoldCursor.f23998a;
                ((EditTextBoldCursor) this.f24931b).invalidate();
                return;
            default:
                xi0.g((xi0) this.f24931b);
                return;
        }
    }
}
