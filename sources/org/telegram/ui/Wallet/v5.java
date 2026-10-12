package org.telegram.ui.Wallet;
public final class v5 implements o1.g {
    public final int f33779a;
    public final b6 f33780b;

    public v5(b6 b6Var, int i10) {
        this.f33779a = i10;
        this.f33780b = b6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f33779a) {
            case 0:
                b6 b6Var = this.f33780b;
                b6Var.f32969c.setScaleX(f7);
                b6Var.f32969c.setScaleY(f7);
                return;
            default:
                this.f33780b.P = f10;
                return;
        }
    }
}
