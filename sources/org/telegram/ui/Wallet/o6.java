package org.telegram.ui.Wallet;
public final class o6 implements r1.d {
    public final int f42942a;
    public final u6 f42943b;

    public o6(u6 u6Var, int i7) {
        this.f42942a = i7;
        this.f42943b = u6Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f42942a) {
            case 0:
                u6 u6Var = this.f42943b;
                u6Var.f43178c.setScaleX(f10);
                u6Var.f43178c.setScaleY(f10);
                return;
            default:
                this.f42943b.P = f11;
                return;
        }
    }
}
