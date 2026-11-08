package org.telegram.ui.Wallet;
public final class p6 implements r1.d {
    public final int f43024a;
    public final v6 f43025b;

    public p6(v6 v6Var, int i7) {
        this.f43024a = i7;
        this.f43025b = v6Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43024a) {
            case 0:
                v6 v6Var = this.f43025b;
                v6Var.f43260c.setScaleX(f10);
                v6Var.f43260c.setScaleY(f10);
                return;
            default:
                this.f43025b.P = f11;
                return;
        }
    }
}
