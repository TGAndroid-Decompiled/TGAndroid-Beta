package org.telegram.ui.Wallet;
public final class q6 implements r1.d {
    public final int f44389a;
    public final w6 f44390b;

    public q6(w6 w6Var, int i7) {
        this.f44389a = i7;
        this.f44390b = w6Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f44389a) {
            case 0:
                w6 w6Var = this.f44390b;
                w6Var.f44636c.setScaleX(f10);
                w6Var.f44636c.setScaleY(f10);
                return;
            default:
                this.f44390b.Q = f11;
                return;
        }
    }
}
