package org.telegram.ui.Components;
public final class la0 implements Runnable {
    public final int f28056a;
    public final ua0 f28057b;

    public la0(ua0 ua0Var, int i10) {
        this.f28056a = i10;
        this.f28057b = ua0Var;
    }

    @Override
    public final void run() {
        switch (this.f28056a) {
            case 0:
                ua0 ua0Var = this.f28057b;
                ag.b1 b1Var = ua0Var.f30882f;
                if (ua0Var.f30881c0.d.f17128r) {
                    b1Var.x0(-b1Var.computeVerticalScrollOffset(), 250, ci.o.V);
                    return;
                }
                b1Var.x0(b1Var.computeVerticalScrollRange() - (b1Var.computeVerticalScrollExtent() + b1Var.computeVerticalScrollOffset()), 250, ci.o.V);
                return;
            default:
                this.f28057b.h(true, false);
                return;
        }
    }
}
