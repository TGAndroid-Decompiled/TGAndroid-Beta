package org.telegram.ui.Components;
public final class x90 implements Runnable {
    public final int f40236a;
    public final y90 f40237b;

    public x90(y90 y90Var, int i7) {
        this.f40236a = i7;
        this.f40237b = y90Var;
    }

    @Override
    public final void run() {
        switch (this.f40236a) {
            case 0:
                y90 y90Var = this.f40237b;
                if (y90Var.W != -1) {
                    org.telegram.messenger.qs.f(y90Var.Y.f32507c0.f34547x).j(y90Var.W);
                    y90Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f40237b.Y.i();
                return;
            default:
                y90 y90Var2 = this.f40237b;
                if (y90Var2.W != -1) {
                    org.telegram.messenger.qs.f(y90Var2.Y.f32507c0.f34547x).j(y90Var2.W);
                    y90Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
