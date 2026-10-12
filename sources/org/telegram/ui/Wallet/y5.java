package org.telegram.ui.Wallet;
public final class y5 implements o1.g {
    public final int f35544a;
    public final e6 f35545b;

    public y5(e6 e6Var, int i10) {
        this.f35544a = i10;
        this.f35545b = e6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35544a) {
            case 0:
                e6 e6Var = this.f35545b;
                e6Var.f34661c.setScaleX(f7);
                e6Var.f34661c.setScaleY(f7);
                return;
            default:
                this.f35545b.P = f10;
                return;
        }
    }
}
