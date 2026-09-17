package org.telegram.ui.Components;
public final class bb0 implements Runnable {
    public final int f24683a;
    public final qb0 f24684b;

    public bb0(qb0 qb0Var, int i10) {
        this.f24683a = i10;
        this.f24684b = qb0Var;
    }

    @Override
    public final void run() {
        switch (this.f24683a) {
            case 0:
                qb0 qb0Var = this.f24684b;
                ib0 ib0Var = qb0Var.f29692f;
                if (qb0Var.f29690c0.d.webpageTop) {
                    ib0Var.w0(-ib0Var.computeVerticalScrollOffset(), 250, ki.o.V);
                    return;
                }
                ib0Var.w0(ib0Var.computeVerticalScrollRange() - (ib0Var.computeVerticalScrollExtent() + ib0Var.computeVerticalScrollOffset()), 250, ki.o.V);
                return;
            default:
                this.f24684b.g(true, false);
                return;
        }
    }
}
