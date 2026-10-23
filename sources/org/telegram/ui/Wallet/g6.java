package org.telegram.ui.Wallet;
public final class g6 implements o1.g {
    public final int f34543a;
    public final m6 f34544b;

    public g6(m6 m6Var, int i10) {
        this.f34543a = i10;
        this.f34544b = m6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34543a) {
            case 0:
                m6 m6Var = this.f34544b;
                m6Var.f34861c.setScaleX(f7);
                m6Var.f34861c.setScaleY(f7);
                return;
            default:
                this.f34544b.P = f10;
                return;
        }
    }
}
