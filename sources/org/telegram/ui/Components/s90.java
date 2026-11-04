package org.telegram.ui.Components;
public final class s90 implements Runnable {
    public final int f37953a;
    public final t90 f37954b;

    public s90(t90 t90Var, int i3) {
        this.f37953a = i3;
        this.f37954b = t90Var;
    }

    @Override
    public final void run() {
        switch (this.f37953a) {
            case 0:
                t90 t90Var = this.f37954b;
                if (t90Var.W != -1) {
                    org.telegram.messenger.hs.f(t90Var.Y.f40291d0.f33042x).j(t90Var.W);
                    t90Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f37954b.Y.i();
                return;
            default:
                t90 t90Var2 = this.f37954b;
                if (t90Var2.W != -1) {
                    org.telegram.messenger.hs.f(t90Var2.Y.f40291d0.f33042x).j(t90Var2.W);
                    t90Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
