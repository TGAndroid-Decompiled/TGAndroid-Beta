package org.telegram.ui.Components;
public final class ha0 implements Runnable {
    public final int f35859a;
    public final qa0 f35860b;

    public ha0(qa0 qa0Var, int i7) {
        this.f35859a = i7;
        this.f35860b = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f35859a) {
            case 0:
                qa0 qa0Var = this.f35860b;
                di.b1 b1Var = qa0Var.f38860f;
                if (qa0Var.f38858d0.d.f25094r) {
                    b1Var.x0(-b1Var.computeVerticalScrollOffset(), 250, pi.k.V);
                    return;
                }
                b1Var.x0(b1Var.computeVerticalScrollRange() - (b1Var.computeVerticalScrollExtent() + b1Var.computeVerticalScrollOffset()), 250, pi.k.V);
                return;
            default:
                this.f35860b.h(true, false);
                return;
        }
    }
}
