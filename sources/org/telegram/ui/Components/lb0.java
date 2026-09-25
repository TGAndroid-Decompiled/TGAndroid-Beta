package org.telegram.ui.Components;
public final class lb0 implements Runnable {
    public final int f26058a;
    public final zb0 f26059b;

    public lb0(zb0 zb0Var, int i10) {
        this.f26058a = i10;
        this.f26059b = zb0Var;
    }

    @Override
    public final void run() {
        switch (this.f26058a) {
            case 0:
                zb0 zb0Var = this.f26059b;
                sb0 sb0Var = zb0Var.f30841f;
                if (zb0Var.f30840c0.d.webpageTop) {
                    sb0Var.w0(-sb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                sb0Var.w0(sb0Var.computeVerticalScrollRange() - (sb0Var.computeVerticalScrollExtent() + sb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f26059b.g(true, false);
                return;
        }
    }
}
