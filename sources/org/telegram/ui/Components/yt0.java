package org.telegram.ui.Components;
public final class yt0 implements Runnable {
    public final int f40728a;
    public final au0 f40729b;

    public yt0(au0 au0Var, int i7) {
        this.f40728a = i7;
        this.f40729b = au0Var;
    }

    @Override
    public final void run() {
        switch (this.f40728a) {
            case 0:
                au0 au0Var = this.f40729b;
                au0Var.V0 = false;
                if (!au0Var.Y0 && au0Var.W0) {
                    au0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f40729b.V0 = false;
                return;
            case 2:
                au0 au0Var2 = this.f40729b;
                au0Var2.Y0 = false;
                if (!au0Var2.V0 && au0Var2.W0) {
                    au0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f40729b.Y0 = false;
                return;
        }
    }
}
