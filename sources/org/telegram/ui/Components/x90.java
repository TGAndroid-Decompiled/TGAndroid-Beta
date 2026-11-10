package org.telegram.ui.Components;
public final class x90 implements Runnable {
    public final int f40272a;
    public final y90 f40273b;

    public x90(y90 y90Var, int i7) {
        this.f40272a = i7;
        this.f40273b = y90Var;
    }

    @Override
    public final void run() {
        switch (this.f40272a) {
            case 0:
                y90 y90Var = this.f40273b;
                if (y90Var.W != -1) {
                    org.telegram.messenger.qs.f(y90Var.Y.f32524c0.f34588x).j(y90Var.W);
                    y90Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f40273b.Y.i();
                return;
            default:
                y90 y90Var2 = this.f40273b;
                if (y90Var2.W != -1) {
                    org.telegram.messenger.qs.f(y90Var2.Y.f32524c0.f34588x).j(y90Var2.W);
                    y90Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
