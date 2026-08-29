package org.telegram.ui.Components;
public final class xa0 implements Runnable {
    public final int f34668a;
    public final lb0 f34669b;

    public xa0(lb0 lb0Var, int i10) {
        this.f34668a = i10;
        this.f34669b = lb0Var;
    }

    @Override
    public final void run() {
        switch (this.f34668a) {
            case 0:
                lb0 lb0Var = this.f34669b;
                eb0 eb0Var = lb0Var.f30277f;
                if (lb0Var.V.d.webpageTop) {
                    eb0Var.w0(-eb0Var.computeVerticalScrollOffset(), 250, uh.m.V);
                    return;
                }
                eb0Var.w0(eb0Var.computeVerticalScrollRange() - (eb0Var.computeVerticalScrollExtent() + eb0Var.computeVerticalScrollOffset()), 250, uh.m.V);
                return;
            default:
                this.f34669b.g(true, false);
                return;
        }
    }
}
