package org.telegram.ui.Components;
public final class uv0 implements Runnable {
    public final int f30988a;
    public final wv0 f30989b;

    public uv0(wv0 wv0Var, int i10) {
        this.f30988a = i10;
        this.f30989b = wv0Var;
    }

    @Override
    public final void run() {
        switch (this.f30988a) {
            case 0:
                wv0 wv0Var = this.f30989b;
                wv0Var.V0 = false;
                if (!wv0Var.Y0 && wv0Var.W0) {
                    wv0Var.A(true);
                    return;
                }
                return;
            case 1:
                this.f30989b.V0 = false;
                return;
            case 2:
                wv0 wv0Var2 = this.f30989b;
                wv0Var2.Y0 = false;
                if (!wv0Var2.V0 && wv0Var2.W0) {
                    wv0Var2.A(true);
                    return;
                }
                return;
            default:
                this.f30989b.Y0 = false;
                return;
        }
    }
}
