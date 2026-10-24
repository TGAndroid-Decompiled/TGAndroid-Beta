package org.telegram.ui.Components;
public final class ub0 implements Runnable {
    public final int f31079a;
    public final jc0 f31080b;

    public ub0(jc0 jc0Var, int i10) {
        this.f31079a = i10;
        this.f31080b = jc0Var;
    }

    @Override
    public final void run() {
        switch (this.f31079a) {
            case 0:
                jc0 jc0Var = this.f31080b;
                cc0 cc0Var = jc0Var.f27675f;
                if (jc0Var.f27674c0.d.webpageTop) {
                    cc0Var.w0(-cc0Var.computeVerticalScrollOffset(), 250, li.m.V);
                    return;
                }
                cc0Var.w0(cc0Var.computeVerticalScrollRange() - (cc0Var.computeVerticalScrollExtent() + cc0Var.computeVerticalScrollOffset()), 250, li.m.V);
                return;
            default:
                this.f31080b.h(true, false);
                return;
        }
    }
}
