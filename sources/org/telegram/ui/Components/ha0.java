package org.telegram.ui.Components;
public final class ha0 implements Runnable {
    public final int f35811a;
    public final qa0 f35812b;

    public ha0(qa0 qa0Var, int i7) {
        this.f35811a = i7;
        this.f35812b = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f35811a) {
            case 0:
                qa0 qa0Var = this.f35812b;
                di.b1 b1Var = qa0Var.f38813f;
                if (qa0Var.f38811d0.d.f25058r) {
                    b1Var.x0(-b1Var.computeVerticalScrollOffset(), 250, pi.k.V);
                    return;
                }
                b1Var.x0(b1Var.computeVerticalScrollRange() - (b1Var.computeVerticalScrollExtent() + b1Var.computeVerticalScrollOffset()), 250, pi.k.V);
                return;
            default:
                this.f35812b.h(true, false);
                return;
        }
    }
}
