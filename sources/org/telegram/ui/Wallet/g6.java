package org.telegram.ui.Wallet;
public final class g6 implements o1.g {
    public final int f34256a;
    public final m6 f34257b;

    public g6(m6 m6Var, int i10) {
        this.f34256a = i10;
        this.f34257b = m6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34256a) {
            case 0:
                m6 m6Var = this.f34257b;
                m6Var.f34523c.setScaleX(f7);
                m6Var.f34523c.setScaleY(f7);
                return;
            default:
                this.f34257b.P = f10;
                return;
        }
    }
}
