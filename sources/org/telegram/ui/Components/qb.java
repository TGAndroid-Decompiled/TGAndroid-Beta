package org.telegram.ui.Components;
public final class qb extends o1.i {
    public final int f31874a;

    public qb(int i10) {
        this.f31874a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f31874a) {
            case 0:
                return ((ub) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.rg0) obj).N;
            default:
                return ((org.telegram.ui.rg0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f31874a) {
            case 0:
                ub.access$2400((ub) obj, f7);
                return;
            case 1:
                org.telegram.ui.rg0 rg0Var = (org.telegram.ui.rg0) obj;
                rg0Var.N = f7;
                rg0Var.invalidate();
                return;
            default:
                org.telegram.ui.rg0 rg0Var2 = (org.telegram.ui.rg0) obj;
                rg0Var2.M = f7;
                rg0Var2.invalidate();
                return;
        }
    }
}
