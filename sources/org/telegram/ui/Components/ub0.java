package org.telegram.ui.Components;
public final class ub0 implements Runnable {
    public final int f30950a;
    public final ic0 f30951b;

    public ub0(ic0 ic0Var, int i10) {
        this.f30950a = i10;
        this.f30951b = ic0Var;
    }

    @Override
    public final void run() {
        switch (this.f30950a) {
            case 0:
                ic0 ic0Var = this.f30951b;
                bc0 bc0Var = ic0Var.f27186f;
                if (ic0Var.f27185c0.d.webpageTop) {
                    bc0Var.w0(-bc0Var.computeVerticalScrollOffset(), 250, li.m.V);
                    return;
                }
                bc0Var.w0(bc0Var.computeVerticalScrollRange() - (bc0Var.computeVerticalScrollExtent() + bc0Var.computeVerticalScrollOffset()), 250, li.m.V);
                return;
            default:
                this.f30951b.h(true, false);
                return;
        }
    }
}
