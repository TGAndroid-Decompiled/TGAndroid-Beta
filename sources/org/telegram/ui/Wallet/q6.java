package org.telegram.ui.Wallet;
public final class q6 implements r1.d {
    public final int f43056a;
    public final w6 f43057b;

    public q6(w6 w6Var, int i7) {
        this.f43056a = i7;
        this.f43057b = w6Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43056a) {
            case 0:
                w6 w6Var = this.f43057b;
                w6Var.f43290c.setScaleX(f10);
                w6Var.f43290c.setScaleY(f10);
                return;
            default:
                this.f43057b.P = f11;
                return;
        }
    }
}
