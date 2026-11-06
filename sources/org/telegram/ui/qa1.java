package org.telegram.ui;
public final class qa1 implements org.telegram.ui.ActionBar.r1 {
    public final int f49180a;
    public final ya1 f49181b;

    public qa1(ya1 ya1Var, int i7) {
        this.f49180a = i7;
        this.f49181b = ya1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f49180a) {
            case 0:
                this.f49181b.finishFragment();
                return;
            case 1:
                ya1 ya1Var = this.f49181b;
                ya1Var.G0();
                ya1Var.finishFragment();
                return;
            case 2:
                ya1 ya1Var2 = this.f49181b;
                ya1Var2.R = "";
                ya1Var2.J0(false);
                return;
            case 3:
                ya1.f0(this.f49181b);
                return;
            default:
                ya1.c0(this.f49181b);
                return;
        }
    }
}
