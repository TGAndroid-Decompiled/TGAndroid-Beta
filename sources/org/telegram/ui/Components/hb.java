package org.telegram.ui.Components;
public final class hb extends o1.i {
    public final int f25373a;

    public hb(int i10) {
        this.f25373a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f25373a) {
            case 0:
                return ((nb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.zg0) obj).K;
            default:
                return ((org.telegram.ui.zg0) obj).J;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f25373a) {
            case 0:
                nb.access$2200((nb) obj, f10);
                return;
            case 1:
                org.telegram.ui.zg0 zg0Var = (org.telegram.ui.zg0) obj;
                zg0Var.K = f10;
                zg0Var.invalidate();
                return;
            default:
                org.telegram.ui.zg0 zg0Var2 = (org.telegram.ui.zg0) obj;
                zg0Var2.J = f10;
                zg0Var2.invalidate();
                return;
        }
    }
}
