package org.telegram.ui.Components;
public final class o90 implements Runnable {
    public final int f36787a;
    public final x90 f36788b;

    public o90(x90 x90Var, int i3) {
        this.f36787a = i3;
        this.f36788b = x90Var;
    }

    @Override
    public final void run() {
        switch (this.f36787a) {
            case 0:
                x90 x90Var = this.f36788b;
                ci.j1 j1Var = x90Var.f40293f;
                if (x90Var.f40291d0.d.f22212r) {
                    j1Var.x0(-j1Var.computeVerticalScrollOffset(), 250, ni.l.V);
                    return;
                }
                j1Var.x0(j1Var.computeVerticalScrollRange() - (j1Var.computeVerticalScrollExtent() + j1Var.computeVerticalScrollOffset()), 250, ni.l.V);
                return;
            default:
                this.f36788b.h(true, false);
                return;
        }
    }
}
