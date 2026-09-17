package org.telegram.ui.Components;
public final class bb0 implements Runnable {
    public final int f24656a;
    public final qb0 f24657b;

    public bb0(qb0 qb0Var, int i10) {
        this.f24656a = i10;
        this.f24657b = qb0Var;
    }

    @Override
    public final void run() {
        switch (this.f24656a) {
            case 0:
                qb0 qb0Var = this.f24657b;
                ib0 ib0Var = qb0Var.f29665f;
                if (qb0Var.f29663c0.d.webpageTop) {
                    ib0Var.w0(-ib0Var.computeVerticalScrollOffset(), 250, ki.o.V);
                    return;
                }
                ib0Var.w0(ib0Var.computeVerticalScrollRange() - (ib0Var.computeVerticalScrollExtent() + ib0Var.computeVerticalScrollOffset()), 250, ki.o.V);
                return;
            default:
                this.f24657b.g(true, false);
                return;
        }
    }
}
