package org.telegram.ui.Components;
public final class ub0 implements Runnable {
    public final int f30885a;
    public final ic0 f30886b;

    public ub0(ic0 ic0Var, int i10) {
        this.f30885a = i10;
        this.f30886b = ic0Var;
    }

    @Override
    public final void run() {
        switch (this.f30885a) {
            case 0:
                ic0 ic0Var = this.f30886b;
                bc0 bc0Var = ic0Var.f27238f;
                if (ic0Var.f27237c0.d.webpageTop) {
                    bc0Var.w0(-bc0Var.computeVerticalScrollOffset(), 250, li.m.V);
                    return;
                }
                bc0Var.w0(bc0Var.computeVerticalScrollRange() - (bc0Var.computeVerticalScrollExtent() + bc0Var.computeVerticalScrollOffset()), 250, li.m.V);
                return;
            default:
                this.f30886b.h(true, false);
                return;
        }
    }
}
