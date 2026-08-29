package org.telegram.ui.Components;
public final class b6 implements jf.i {
    public final int f26982a;
    public final Object f26983b;

    public b6(Object obj, int i10) {
        this.f26982a = i10;
        this.f26983b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f26982a) {
            case 0:
                c6 c6Var = (c6) this.f26983b;
                int i10 = c6Var.M0 + 1;
                c6Var.M0 = i10;
                if (i10 > 10) {
                    c6Var.N0 = true;
                }
                c6Var.i();
                if (c6Var.Q0) {
                    c6Var.P0 = true;
                    c6Var.t();
                    return;
                }
                return;
            case 1:
                int i11 = EditTextBoldCursor.f26384a;
                ((EditTextBoldCursor) this.f26983b).invalidate();
                return;
            default:
                xi0.g((xi0) this.f26983b);
                return;
        }
    }
}
