package org.telegram.ui.Components;
public final class hb extends o1.i {
    public final int f29025a;

    public hb(int i9) {
        this.f29025a = i9;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f29025a) {
            case 0:
                return ((lb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.pg0) obj).J;
            default:
                return ((org.telegram.ui.pg0) obj).I;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f29025a) {
            case 0:
                lb.access$2200((lb) obj, f10);
                return;
            case 1:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) obj;
                pg0Var.J = f10;
                pg0Var.invalidate();
                return;
            default:
                org.telegram.ui.pg0 pg0Var2 = (org.telegram.ui.pg0) obj;
                pg0Var2.I = f10;
                pg0Var2.invalidate();
                return;
        }
    }
}
