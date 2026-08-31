package org.telegram.ui.Components;
public final class xv0 implements Runnable {
    public final int f33185a;
    public final zv0 f33186b;

    public xv0(zv0 zv0Var, int i10) {
        this.f33185a = i10;
        this.f33186b = zv0Var;
    }

    @Override
    public final void run() {
        switch (this.f33185a) {
            case 0:
                zv0 zv0Var = this.f33186b;
                zv0Var.S0 = false;
                if (!zv0Var.V0 && zv0Var.T0) {
                    zv0Var.A(true);
                    return;
                }
                return;
            case 1:
                this.f33186b.S0 = false;
                return;
            case 2:
                zv0 zv0Var2 = this.f33186b;
                zv0Var2.V0 = false;
                if (!zv0Var2.S0 && zv0Var2.T0) {
                    zv0Var2.A(true);
                    return;
                }
                return;
            default:
                this.f33186b.V0 = false;
                return;
        }
    }
}
