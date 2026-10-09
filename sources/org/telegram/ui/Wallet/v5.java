package org.telegram.ui.Wallet;
public final class v5 implements o1.g {
    public final int f35554a;
    public final b6 f35555b;

    public v5(b6 b6Var, int i10) {
        this.f35554a = i10;
        this.f35555b = b6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35554a) {
            case 0:
                b6 b6Var = this.f35555b;
                b6Var.f34662c.setScaleX(f7);
                b6Var.f34662c.setScaleY(f7);
                return;
            default:
                this.f35555b.P = f10;
                return;
        }
    }
}
