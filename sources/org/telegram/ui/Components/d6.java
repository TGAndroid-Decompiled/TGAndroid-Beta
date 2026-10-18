package org.telegram.ui.Components;
public final class d6 implements zf.g {
    public final int f25496a;
    public final Object f25497b;

    public d6(Object obj, int i10) {
        this.f25496a = i10;
        this.f25497b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f25496a) {
            case 0:
                e6 e6Var = (e6) this.f25497b;
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
                int i11 = EditTextBoldCursor.f24214a;
                ((EditTextBoldCursor) this.f25497b).invalidate();
                return;
            default:
                uj0.g((uj0) this.f25497b);
                return;
        }
    }
}
