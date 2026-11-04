package org.telegram.ui.Components;
public final class wt0 implements Runnable {
    public final int f40151a;
    public final yt0 f40152b;

    public wt0(yt0 yt0Var, int i3) {
        this.f40151a = i3;
        this.f40152b = yt0Var;
    }

    @Override
    public final void run() {
        switch (this.f40151a) {
            case 0:
                yt0 yt0Var = this.f40152b;
                yt0Var.W0 = false;
                if (!yt0Var.Z0 && yt0Var.X0) {
                    yt0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f40152b.W0 = false;
                return;
            case 2:
                yt0 yt0Var2 = this.f40152b;
                yt0Var2.Z0 = false;
                if (!yt0Var2.W0 && yt0Var2.X0) {
                    yt0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f40152b.Z0 = false;
                return;
        }
    }
}
