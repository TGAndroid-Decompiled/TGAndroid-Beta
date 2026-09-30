package org.telegram.ui.Components;
public final class ob0 implements Runnable {
    public final int f27051a;
    public final cc0 f27052b;

    public ob0(cc0 cc0Var, int i10) {
        this.f27051a = i10;
        this.f27052b = cc0Var;
    }

    @Override
    public final void run() {
        switch (this.f27051a) {
            case 0:
                cc0 cc0Var = this.f27052b;
                vb0 vb0Var = cc0Var.f23265f;
                if (cc0Var.f23264c0.d.webpageTop) {
                    vb0Var.x0(-vb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                vb0Var.x0(vb0Var.computeVerticalScrollRange() - (vb0Var.computeVerticalScrollExtent() + vb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f27052b.g(true, false);
                return;
        }
    }
}
