package org.telegram.ui.Wallet;
public final class r6 implements r1.d {
    public final int f43116a;
    public final x6 f43117b;

    public r6(x6 x6Var, int i7) {
        this.f43116a = i7;
        this.f43117b = x6Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43116a) {
            case 0:
                x6 x6Var = this.f43117b;
                x6Var.f43337c.setScaleX(f10);
                x6Var.f43337c.setScaleY(f10);
                return;
            default:
                this.f43117b.P = f11;
                return;
        }
    }
}
