package org.telegram.ui.Components;
public final class ac0 implements Runnable {
    public final int f23194a;
    public final pc0 f23195b;

    public ac0(pc0 pc0Var, int i10) {
        this.f23194a = i10;
        this.f23195b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f23194a) {
            case 0:
                pc0 pc0Var = this.f23195b;
                hc0 hc0Var = pc0Var.f27968f;
                if (pc0Var.f27967c0.d.webpageTop) {
                    hc0Var.w0(-hc0Var.computeVerticalScrollOffset(), 250, ki.n.V);
                    return;
                }
                hc0Var.w0(hc0Var.computeVerticalScrollRange() - (hc0Var.computeVerticalScrollExtent() + hc0Var.computeVerticalScrollOffset()), 250, ki.n.V);
                return;
            default:
                this.f23195b.g(true, false);
                return;
        }
    }
}
