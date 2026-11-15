package org.telegram.ui.Components;
public final class z90 implements Runnable {
    public final int f42325a;
    public final aa0 f42326b;

    public z90(aa0 aa0Var, int i7) {
        this.f42325a = i7;
        this.f42326b = aa0Var;
    }

    @Override
    public final void run() {
        switch (this.f42325a) {
            case 0:
                aa0 aa0Var = this.f42326b;
                if (aa0Var.W != -1) {
                    org.telegram.messenger.ns.f(aa0Var.Y.f34260d0.f36344x).j(aa0Var.W);
                    aa0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f42326b.Y.i();
                return;
            default:
                aa0 aa0Var2 = this.f42326b;
                if (aa0Var2.W != -1) {
                    org.telegram.messenger.ns.f(aa0Var2.Y.f34260d0.f36344x).j(aa0Var2.W);
                    aa0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
