package org.telegram.ui.Wallet;
public final class g6 implements o1.g {
    public final int f36625a;
    public final m6 f36626b;

    public g6(m6 m6Var, int i10) {
        this.f36625a = i10;
        this.f36626b = m6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f36625a) {
            case 0:
                m6 m6Var = this.f36626b;
                m6Var.f36977c.setScaleX(f7);
                m6Var.f36977c.setScaleY(f7);
                return;
            default:
                this.f36626b.P = f10;
                return;
        }
    }
}
