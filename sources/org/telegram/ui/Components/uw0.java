package org.telegram.ui.Components;
public final class uw0 implements Runnable {
    public final int f31228a;
    public final ww0 f31229b;

    public uw0(ww0 ww0Var, int i10) {
        this.f31228a = i10;
        this.f31229b = ww0Var;
    }

    @Override
    public final void run() {
        switch (this.f31228a) {
            case 0:
                ww0 ww0Var = this.f31229b;
                ww0Var.V0 = false;
                if (!ww0Var.Y0 && ww0Var.W0) {
                    ww0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f31229b.V0 = false;
                return;
            case 2:
                ww0 ww0Var2 = this.f31229b;
                ww0Var2.Y0 = false;
                if (!ww0Var2.V0 && ww0Var2.W0) {
                    ww0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f31229b.Y0 = false;
                return;
        }
    }
}
