package org.telegram.ui.Components;
public final class ya extends r1.e {
    public final int f41962a;

    public ya(int i7) {
        this.f41962a = i7;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f41962a) {
            case 0:
                return ((cb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.le0) obj).O;
            default:
                return ((org.telegram.ui.le0) obj).N;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f41962a) {
            case 0:
                cb.access$2200((cb) obj, f10);
                return;
            case 1:
                org.telegram.ui.le0 le0Var = (org.telegram.ui.le0) obj;
                le0Var.O = f10;
                le0Var.invalidate();
                return;
            default:
                org.telegram.ui.le0 le0Var2 = (org.telegram.ui.le0) obj;
                le0Var2.N = f10;
                le0Var2.invalidate();
                return;
        }
    }
}
