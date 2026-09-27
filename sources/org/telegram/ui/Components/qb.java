package org.telegram.ui.Components;
public final class qb extends o1.i {
    public final int f27683a;

    public qb(int i10) {
        this.f27683a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f27683a) {
            case 0:
                return ((ub) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.dh0) obj).N;
            default:
                return ((org.telegram.ui.dh0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f27683a) {
            case 0:
                ub.access$2200((ub) obj, f7);
                return;
            case 1:
                org.telegram.ui.dh0 dh0Var = (org.telegram.ui.dh0) obj;
                dh0Var.N = f7;
                dh0Var.invalidate();
                return;
            default:
                org.telegram.ui.dh0 dh0Var2 = (org.telegram.ui.dh0) obj;
                dh0Var2.M = f7;
                dh0Var2.invalidate();
                return;
        }
    }
}
