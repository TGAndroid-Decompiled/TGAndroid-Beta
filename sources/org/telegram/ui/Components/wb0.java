package org.telegram.ui.Components;
public final class wb0 implements Runnable {
    public final int f32210a;
    public final lc0 f32211b;

    public wb0(lc0 lc0Var, int i10) {
        this.f32210a = i10;
        this.f32211b = lc0Var;
    }

    @Override
    public final void run() {
        switch (this.f32210a) {
            case 0:
                lc0 lc0Var = this.f32211b;
                ec0 ec0Var = lc0Var.f28341f;
                if (lc0Var.f28340c0.d.webpageTop) {
                    ec0Var.w0(-ec0Var.computeVerticalScrollOffset(), 250, li.m.V);
                    return;
                }
                ec0Var.w0(ec0Var.computeVerticalScrollRange() - (ec0Var.computeVerticalScrollExtent() + ec0Var.computeVerticalScrollOffset()), 250, li.m.V);
                return;
            default:
                this.f32211b.h(true, false);
                return;
        }
    }
}
