package org.telegram.ui.Wallet;
public final class u6 implements o1.g {
    public final int f35281a;
    public final a7 f35282b;

    public u6(a7 a7Var, int i10) {
        this.f35281a = i10;
        this.f35282b = a7Var;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f35281a) {
            case 0:
                a7 a7Var = this.f35282b;
                a7Var.f34195c.setScaleX(f7);
                a7Var.f34195c.setScaleY(f7);
                return;
            default:
                this.f35282b.P = f10;
                return;
        }
    }
}
