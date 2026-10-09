package org.telegram.ui.Wallet;
public final class w5 implements o1.g {
    public final int f35616a;
    public final c6 f35617b;

    public w5(c6 c6Var, int i10) {
        this.f35616a = i10;
        this.f35617b = c6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35616a) {
            case 0:
                c6 c6Var = this.f35617b;
                c6Var.f34733c.setScaleX(f7);
                c6Var.f34733c.setScaleY(f7);
                return;
            default:
                this.f35617b.P = f10;
                return;
        }
    }
}
