package org.telegram.ui.Components;
public final class y90 implements Runnable {
    public final int f41958a;
    public final z90 f41959b;

    public y90(z90 z90Var, int i7) {
        this.f41958a = i7;
        this.f41959b = z90Var;
    }

    @Override
    public final void run() {
        switch (this.f41958a) {
            case 0:
                z90 z90Var = this.f41959b;
                if (z90Var.W != -1) {
                    org.telegram.messenger.ns.f(z90Var.Y.f33900d0.f35957x).j(z90Var.W);
                    z90Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f41959b.Y.i();
                return;
            default:
                z90 z90Var2 = this.f41959b;
                if (z90Var2.W != -1) {
                    org.telegram.messenger.ns.f(z90Var2.Y.f33900d0.f35957x).j(z90Var2.W);
                    z90Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
