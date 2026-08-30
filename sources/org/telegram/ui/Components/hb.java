package org.telegram.ui.Components;
public final class hb extends o1.i {
    public final int f25385a;

    public hb(int i10) {
        this.f25385a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f25385a) {
            case 0:
                return ((nb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.xg0) obj).K;
            default:
                return ((org.telegram.ui.xg0) obj).J;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f25385a) {
            case 0:
                nb.access$2200((nb) obj, f10);
                return;
            case 1:
                org.telegram.ui.xg0 xg0Var = (org.telegram.ui.xg0) obj;
                xg0Var.K = f10;
                xg0Var.invalidate();
                return;
            default:
                org.telegram.ui.xg0 xg0Var2 = (org.telegram.ui.xg0) obj;
                xg0Var2.J = f10;
                xg0Var2.invalidate();
                return;
        }
    }
}
