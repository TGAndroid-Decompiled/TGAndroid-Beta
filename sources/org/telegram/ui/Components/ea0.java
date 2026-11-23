package org.telegram.ui.Components;
public final class ea0 implements Runnable {
    public final int f34681a;
    public final na0 f34682b;

    public ea0(na0 na0Var, int i7) {
        this.f34681a = i7;
        this.f34682b = na0Var;
    }

    @Override
    public final void run() {
        switch (this.f34681a) {
            case 0:
                na0 na0Var = this.f34682b;
                di.b1 b1Var = na0Var.f37744f;
                if (na0Var.f37742d0.d.f24989r) {
                    b1Var.x0(-b1Var.computeVerticalScrollOffset(), 250, pi.k.V);
                    return;
                }
                b1Var.x0(b1Var.computeVerticalScrollRange() - (b1Var.computeVerticalScrollExtent() + b1Var.computeVerticalScrollOffset()), 250, pi.k.V);
                return;
            default:
                this.f34682b.h(true, false);
                return;
        }
    }
}
