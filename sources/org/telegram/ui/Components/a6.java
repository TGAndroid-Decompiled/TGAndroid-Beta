package org.telegram.ui.Components;
public final class a6 implements yf.g {
    public final int f22317a;
    public final Object f22318b;

    public a6(Object obj, int i10) {
        this.f22317a = i10;
        this.f22318b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f22317a) {
            case 0:
                b6 b6Var = (b6) this.f22318b;
                int i10 = b6Var.Q0 + 1;
                b6Var.Q0 = i10;
                if (i10 > 10) {
                    b6Var.R0 = true;
                }
                b6Var.i();
                if (b6Var.U0) {
                    b6Var.T0 = true;
                    b6Var.t();
                    return;
                }
                return;
            case 1:
                int i11 = EditTextBoldCursor.f22032a;
                ((EditTextBoldCursor) this.f22318b).invalidate();
                return;
            default:
                xi0.g((xi0) this.f22318b);
                return;
        }
    }
}
