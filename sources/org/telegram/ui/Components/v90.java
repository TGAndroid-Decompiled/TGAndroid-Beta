package org.telegram.ui.Components;
public final class v90 implements Runnable {
    public final int f40359a;
    public final ea0 f40360b;

    public v90(ea0 ea0Var, int i7) {
        this.f40359a = i7;
        this.f40360b = ea0Var;
    }

    @Override
    public final void run() {
        switch (this.f40359a) {
            case 0:
                ea0 ea0Var = this.f40360b;
                di.c1 c1Var = ea0Var.f34262f;
                if (ea0Var.f34260d0.d.f24721r) {
                    c1Var.x0(-c1Var.computeVerticalScrollOffset(), 250, pi.k.V);
                    return;
                }
                c1Var.x0(c1Var.computeVerticalScrollRange() - (c1Var.computeVerticalScrollExtent() + c1Var.computeVerticalScrollOffset()), 250, pi.k.V);
                return;
            default:
                this.f40360b.h(true, false);
                return;
        }
    }
}
