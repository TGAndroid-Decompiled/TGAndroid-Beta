package org.telegram.ui.Components;
public final class ha0 implements Runnable {
    public final int f35865a;
    public final qa0 f35866b;

    public ha0(qa0 qa0Var, int i7) {
        this.f35865a = i7;
        this.f35866b = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f35865a) {
            case 0:
                qa0 qa0Var = this.f35866b;
                di.b1 b1Var = qa0Var.f38866f;
                if (qa0Var.f38864d0.d.f24907r) {
                    b1Var.x0(-b1Var.computeVerticalScrollOffset(), 250, pi.k.V);
                    return;
                }
                b1Var.x0(b1Var.computeVerticalScrollRange() - (b1Var.computeVerticalScrollExtent() + b1Var.computeVerticalScrollOffset()), 250, pi.k.V);
                return;
            default:
                this.f35866b.h(true, false);
                return;
        }
    }
}
