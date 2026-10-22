package org.telegram.ui.Components;
public final class ub0 implements Runnable {
    public final int f30888a;
    public final ic0 f30889b;

    public ub0(ic0 ic0Var, int i10) {
        this.f30888a = i10;
        this.f30889b = ic0Var;
    }

    @Override
    public final void run() {
        switch (this.f30888a) {
            case 0:
                ic0 ic0Var = this.f30889b;
                bc0 bc0Var = ic0Var.f27241f;
                if (ic0Var.f27240c0.d.webpageTop) {
                    bc0Var.w0(-bc0Var.computeVerticalScrollOffset(), 250, li.m.V);
                    return;
                }
                bc0Var.w0(bc0Var.computeVerticalScrollRange() - (bc0Var.computeVerticalScrollExtent() + bc0Var.computeVerticalScrollOffset()), 250, li.m.V);
                return;
            default:
                this.f30889b.h(true, false);
                return;
        }
    }
}
