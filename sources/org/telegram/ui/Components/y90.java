package org.telegram.ui.Components;
public final class y90 implements Runnable {
    public final int f40685a;
    public final z90 f40686b;

    public y90(z90 z90Var, int i7) {
        this.f40685a = i7;
        this.f40686b = z90Var;
    }

    @Override
    public final void run() {
        switch (this.f40685a) {
            case 0:
                z90 z90Var = this.f40686b;
                if (z90Var.W != -1) {
                    org.telegram.messenger.qs.f(z90Var.Y.f32920c0.f34979x).j(z90Var.W);
                    z90Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f40686b.Y.i();
                return;
            default:
                z90 z90Var2 = this.f40686b;
                if (z90Var2.W != -1) {
                    org.telegram.messenger.qs.f(z90Var2.Y.f32920c0.f34979x).j(z90Var2.W);
                    z90Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
