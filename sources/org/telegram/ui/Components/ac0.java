package org.telegram.ui.Components;
public final class ac0 implements Runnable {
    public final int f23515a;
    public final pc0 f23516b;

    public ac0(pc0 pc0Var, int i10) {
        this.f23515a = i10;
        this.f23516b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f23515a) {
            case 0:
                pc0 pc0Var = this.f23516b;
                hc0 hc0Var = pc0Var.f28287f;
                if (pc0Var.f28286c0.d.webpageTop) {
                    hc0Var.w0(-hc0Var.computeVerticalScrollOffset(), 250, ki.n.V);
                    return;
                }
                hc0Var.w0(hc0Var.computeVerticalScrollRange() - (hc0Var.computeVerticalScrollExtent() + hc0Var.computeVerticalScrollOffset()), 250, ki.n.V);
                return;
            default:
                this.f23516b.g(true, false);
                return;
        }
    }
}
