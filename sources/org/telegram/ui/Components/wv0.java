package org.telegram.ui.Components;
public final class wv0 implements Runnable {
    public final int f30430a;
    public final yv0 f30431b;

    public wv0(yv0 yv0Var, int i10) {
        this.f30430a = i10;
        this.f30431b = yv0Var;
    }

    @Override
    public final void run() {
        switch (this.f30430a) {
            case 0:
                yv0 yv0Var = this.f30431b;
                yv0Var.S0 = false;
                if (!yv0Var.V0 && yv0Var.T0) {
                    yv0Var.A(true);
                    return;
                }
                return;
            case 1:
                this.f30431b.S0 = false;
                return;
            case 2:
                yv0 yv0Var2 = this.f30431b;
                yv0Var2.V0 = false;
                if (!yv0Var2.S0 && yv0Var2.T0) {
                    yv0Var2.A(true);
                    return;
                }
                return;
            default:
                this.f30431b.V0 = false;
                return;
        }
    }
}
