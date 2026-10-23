package org.telegram.ui.Components;
public final class qb extends o1.i {
    public final int f29822a;

    public qb(int i10) {
        this.f29822a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f29822a) {
            case 0:
                return ((ub) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.tg0) obj).N;
            default:
                return ((org.telegram.ui.tg0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f29822a) {
            case 0:
                ub.access$2200((ub) obj, f7);
                return;
            case 1:
                org.telegram.ui.tg0 tg0Var = (org.telegram.ui.tg0) obj;
                tg0Var.N = f7;
                tg0Var.invalidate();
                return;
            default:
                org.telegram.ui.tg0 tg0Var2 = (org.telegram.ui.tg0) obj;
                tg0Var2.M = f7;
                tg0Var2.invalidate();
                return;
        }
    }
}
