package org.telegram.ui.Components;
public final class fa0 implements Runnable {
    public final int f35051a;
    public final oa0 f35052b;

    public fa0(oa0 oa0Var, int i7) {
        this.f35051a = i7;
        this.f35052b = oa0Var;
    }

    @Override
    public final void run() {
        switch (this.f35051a) {
            case 0:
                oa0 oa0Var = this.f35052b;
                di.b1 b1Var = oa0Var.f38047f;
                if (oa0Var.f38045d0.d.f24882r) {
                    b1Var.x0(-b1Var.computeVerticalScrollOffset(), 250, pi.k.V);
                    return;
                }
                b1Var.x0(b1Var.computeVerticalScrollRange() - (b1Var.computeVerticalScrollExtent() + b1Var.computeVerticalScrollOffset()), 250, pi.k.V);
                return;
            default:
                this.f35052b.h(true, false);
                return;
        }
    }
}
