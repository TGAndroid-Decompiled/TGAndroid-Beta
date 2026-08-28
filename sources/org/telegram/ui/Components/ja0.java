package org.telegram.ui.Components;
public final class ja0 implements Runnable {
    public final int f29679a;
    public final wa0 f29680b;

    public ja0(wa0 wa0Var, int i9) {
        this.f29679a = i9;
        this.f29680b = wa0Var;
    }

    @Override
    public final void run() {
        switch (this.f29679a) {
            case 0:
                wa0 wa0Var = this.f29680b;
                pa0 pa0Var = wa0Var.f34172f;
                if (wa0Var.V.d.webpageTop) {
                    pa0Var.w0(-pa0Var.computeVerticalScrollOffset(), 250, rh.m.V);
                    return;
                }
                pa0Var.w0(pa0Var.computeVerticalScrollRange() - (pa0Var.computeVerticalScrollExtent() + pa0Var.computeVerticalScrollOffset()), 250, rh.m.V);
                return;
            default:
                this.f29680b.g(true, false);
                return;
        }
    }
}
