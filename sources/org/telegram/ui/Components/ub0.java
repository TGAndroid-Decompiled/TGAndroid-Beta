package org.telegram.ui.Components;
public final class ub0 implements Runnable {
    public final int f33333a;
    public final ic0 f33334b;

    public ub0(ic0 ic0Var, int i10) {
        this.f33333a = i10;
        this.f33334b = ic0Var;
    }

    @Override
    public final void run() {
        switch (this.f33333a) {
            case 0:
                ic0 ic0Var = this.f33334b;
                bc0 bc0Var = ic0Var.f29307f;
                if (ic0Var.f29306c0.d.webpageTop) {
                    bc0Var.x0(-bc0Var.computeVerticalScrollOffset(), 250, mi.m.V);
                    return;
                }
                bc0Var.x0(bc0Var.computeVerticalScrollRange() - (bc0Var.computeVerticalScrollExtent() + bc0Var.computeVerticalScrollOffset()), 250, mi.m.V);
                return;
            default:
                this.f33334b.h(true, false);
                return;
        }
    }
}
