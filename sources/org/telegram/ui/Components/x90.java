package org.telegram.ui.Components;
public final class x90 implements Runnable {
    public final int f40217a;
    public final y90 f40218b;

    public x90(y90 y90Var, int i7) {
        this.f40217a = i7;
        this.f40218b = y90Var;
    }

    @Override
    public final void run() {
        switch (this.f40217a) {
            case 0:
                y90 y90Var = this.f40218b;
                if (y90Var.W != -1) {
                    org.telegram.messenger.qs.f(y90Var.Y.f32503c0.f34584x).j(y90Var.W);
                    y90Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f40218b.Y.i();
                return;
            default:
                y90 y90Var2 = this.f40218b;
                if (y90Var2.W != -1) {
                    org.telegram.messenger.qs.f(y90Var2.Y.f32503c0.f34584x).j(y90Var2.W);
                    y90Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
