package org.telegram.ui.Wallet;
public final class y5 implements o1.g {
    public final int f35734a;
    public final e6 f35735b;

    public y5(e6 e6Var, int i10) {
        this.f35734a = i10;
        this.f35735b = e6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35734a) {
            case 0:
                e6 e6Var = this.f35735b;
                e6Var.f34852c.setScaleX(f7);
                e6Var.f34852c.setScaleY(f7);
                return;
            default:
                this.f35735b.P = f10;
                return;
        }
    }
}
