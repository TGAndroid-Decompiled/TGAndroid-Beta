package org.telegram.ui.Components;
public final class cb0 implements Runnable {
    public final int f23957a;
    public final qb0 f23958b;

    public cb0(qb0 qb0Var, int i10) {
        this.f23957a = i10;
        this.f23958b = qb0Var;
    }

    @Override
    public final void run() {
        switch (this.f23957a) {
            case 0:
                qb0 qb0Var = this.f23958b;
                ib0 ib0Var = qb0Var.f28105f;
                if (qb0Var.W.d.webpageTop) {
                    ib0Var.w0(-ib0Var.computeVerticalScrollOffset(), 250, wh.n.V);
                    return;
                }
                ib0Var.w0(ib0Var.computeVerticalScrollRange() - (ib0Var.computeVerticalScrollExtent() + ib0Var.computeVerticalScrollOffset()), 250, wh.n.V);
                return;
            default:
                this.f23958b.g(true, false);
                return;
        }
    }
}
