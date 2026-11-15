package org.telegram.ui.Components;
public final class u90 implements Runnable {
    public final int f39981a;
    public final da0 f39982b;

    public u90(da0 da0Var, int i7) {
        this.f39981a = i7;
        this.f39982b = da0Var;
    }

    @Override
    public final void run() {
        switch (this.f39981a) {
            case 0:
                da0 da0Var = this.f39982b;
                di.c1 c1Var = da0Var.f33902f;
                if (da0Var.f33900d0.d.f24718r) {
                    c1Var.x0(-c1Var.computeVerticalScrollOffset(), 250, pi.k.V);
                    return;
                }
                c1Var.x0(c1Var.computeVerticalScrollRange() - (c1Var.computeVerticalScrollExtent() + c1Var.computeVerticalScrollOffset()), 250, pi.k.V);
                return;
            default:
                this.f39982b.h(true, false);
                return;
        }
    }
}
