package org.telegram.ui.Wallet;
public final class q6 implements r1.d {
    public final int f43055a;
    public final w6 f43056b;

    public q6(w6 w6Var, int i7) {
        this.f43055a = i7;
        this.f43056b = w6Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43055a) {
            case 0:
                w6 w6Var = this.f43056b;
                w6Var.f43289c.setScaleX(f10);
                w6Var.f43289c.setScaleY(f10);
                return;
            default:
                this.f43056b.P = f11;
                return;
        }
    }
}
