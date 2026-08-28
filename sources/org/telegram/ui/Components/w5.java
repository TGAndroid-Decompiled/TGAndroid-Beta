package org.telegram.ui.Components;
public final class w5 implements ff.j {
    public final int f34111a;
    public final Object f34112b;

    public w5(Object obj, int i9) {
        this.f34111a = i9;
        this.f34112b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f34111a) {
            case 0:
                x5 x5Var = (x5) this.f34112b;
                int i9 = x5Var.M0 + 1;
                x5Var.M0 = i9;
                if (i9 > 10) {
                    x5Var.N0 = true;
                }
                x5Var.i();
                if (x5Var.Q0) {
                    x5Var.P0 = true;
                    x5Var.t();
                    return;
                }
                return;
            case 1:
                int i10 = EditTextBoldCursor.f26373a;
                ((EditTextBoldCursor) this.f34112b).invalidate();
                return;
            default:
                mi0.g((mi0) this.f34112b);
                return;
        }
    }
}
