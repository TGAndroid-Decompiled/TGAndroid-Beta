package org.telegram.ui.Wallet;
public final class g6 implements o1.g {
    public final int f34246a;
    public final m6 f34247b;

    public g6(m6 m6Var, int i10) {
        this.f34246a = i10;
        this.f34247b = m6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34246a) {
            case 0:
                m6 m6Var = this.f34247b;
                m6Var.f34513c.setScaleX(f7);
                m6Var.f34513c.setScaleY(f7);
                return;
            default:
                this.f34247b.P = f10;
                return;
        }
    }
}
