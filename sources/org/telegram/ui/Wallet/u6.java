package org.telegram.ui.Wallet;
public final class u6 implements o1.g {
    public final int f35275a;
    public final a7 f35276b;

    public u6(a7 a7Var, int i10) {
        this.f35275a = i10;
        this.f35276b = a7Var;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f35275a) {
            case 0:
                a7 a7Var = this.f35276b;
                a7Var.f34196c.setScaleX(f7);
                a7Var.f34196c.setScaleY(f7);
                return;
            default:
                this.f35276b.P = f10;
                return;
        }
    }
}
