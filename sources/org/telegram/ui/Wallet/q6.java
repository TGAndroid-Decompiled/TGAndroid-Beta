package org.telegram.ui.Wallet;
public final class q6 implements r1.d {
    public final int f43031a;
    public final w6 f43032b;

    public q6(w6 w6Var, int i7) {
        this.f43031a = i7;
        this.f43032b = w6Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43031a) {
            case 0:
                w6 w6Var = this.f43032b;
                w6Var.f43265c.setScaleX(f10);
                w6Var.f43265c.setScaleY(f10);
                return;
            default:
                this.f43032b.P = f11;
                return;
        }
    }
}
