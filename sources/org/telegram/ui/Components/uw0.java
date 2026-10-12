package org.telegram.ui.Components;
public final class uw0 implements Runnable {
    public final int f29792a;
    public final ww0 f29793b;

    public uw0(ww0 ww0Var, int i10) {
        this.f29792a = i10;
        this.f29793b = ww0Var;
    }

    @Override
    public final void run() {
        switch (this.f29792a) {
            case 0:
                ww0 ww0Var = this.f29793b;
                ww0Var.V0 = false;
                if (!ww0Var.Y0 && ww0Var.W0) {
                    ww0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f29793b.V0 = false;
                return;
            case 2:
                ww0 ww0Var2 = this.f29793b;
                ww0Var2.Y0 = false;
                if (!ww0Var2.V0 && ww0Var2.W0) {
                    ww0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f29793b.Y0 = false;
                return;
        }
    }
}
