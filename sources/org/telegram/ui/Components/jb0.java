package org.telegram.ui.Components;
public final class jb0 implements Runnable {
    public final int f25286a;
    public final yb0 f25287b;

    public jb0(yb0 yb0Var, int i10) {
        this.f25286a = i10;
        this.f25287b = yb0Var;
    }

    @Override
    public final void run() {
        switch (this.f25286a) {
            case 0:
                yb0 yb0Var = this.f25287b;
                qb0 qb0Var = yb0Var.f30538f;
                if (yb0Var.f30537c0.d.webpageTop) {
                    qb0Var.x0(-qb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                qb0Var.x0(qb0Var.computeVerticalScrollRange() - (qb0Var.computeVerticalScrollExtent() + qb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f25287b.g(true, false);
                return;
        }
    }
}
