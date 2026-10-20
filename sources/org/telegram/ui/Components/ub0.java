package org.telegram.ui.Components;
public final class ub0 implements Runnable {
    public final int f30884a;
    public final ic0 f30885b;

    public ub0(ic0 ic0Var, int i10) {
        this.f30884a = i10;
        this.f30885b = ic0Var;
    }

    @Override
    public final void run() {
        switch (this.f30884a) {
            case 0:
                ic0 ic0Var = this.f30885b;
                bc0 bc0Var = ic0Var.f27238f;
                if (ic0Var.f27237c0.d.webpageTop) {
                    bc0Var.w0(-bc0Var.computeVerticalScrollOffset(), 250, li.m.V);
                    return;
                }
                bc0Var.w0(bc0Var.computeVerticalScrollRange() - (bc0Var.computeVerticalScrollExtent() + bc0Var.computeVerticalScrollOffset()), 250, li.m.V);
                return;
            default:
                this.f30885b.h(true, false);
                return;
        }
    }
}
