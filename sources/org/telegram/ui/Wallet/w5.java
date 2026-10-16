package org.telegram.ui.Wallet;
public final class w5 implements o1.g {
    public final int f33553a;
    public final c6 f33554b;

    public w5(c6 c6Var, int i10) {
        this.f33553a = i10;
        this.f33554b = c6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f33553a) {
            case 0:
                c6 c6Var = this.f33554b;
                c6Var.f32745c.setScaleX(f7);
                c6Var.f32745c.setScaleY(f7);
                return;
            default:
                this.f33554b.P = f10;
                return;
        }
    }
}
