package org.telegram.ui.Components;

public final class w5 implements gf.j {

    public final int f34113a;

    public final Object f34114b;

    public w5(Object obj, int i10) {
        this.f34113a = i10;
        this.f34114b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f34113a) {
            case 0:
                x5 x5Var = (x5) this.f34114b;
                int i10 = x5Var.M0 + 1;
                x5Var.M0 = i10;
                if (i10 > 10) {
                    x5Var.N0 = true;
                }
                x5Var.i();
                if (x5Var.Q0) {
                    x5Var.P0 = true;
                    x5Var.t();
                }
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f34114b;
                int i11 = EditTextBoldCursor.f26369a;
                editTextBoldCursor.invalidate();
                break;
            default:
                oi0.g((oi0) this.f34114b);
                break;
        }
    }
}
