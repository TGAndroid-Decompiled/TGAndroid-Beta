package org.telegram.ui;
public final class lg0 implements Runnable {
    public final int f35500a;
    public final vg0 f35501b;

    public lg0(vg0 vg0Var, int i10) {
        this.f35500a = i10;
        this.f35501b = vg0Var;
    }

    @Override
    public final void run() {
        switch (this.f35500a) {
            case 0:
                vg0 vg0Var = this.f35501b;
                ak0 ak0Var = vg0Var.f38596a;
                wg0 wg0Var = vg0Var.V;
                sg0 sg0Var = vg0Var.f38597b;
                if (sg0Var != null) {
                    if (wg0Var.f39198c0) {
                        ak0Var.clearFocus();
                        sg0Var.clearFocus();
                    } else if (ak0Var.length() != 0) {
                        sg0Var.requestFocus();
                        if (!vg0Var.R) {
                            sg0Var.setSelection(sg0Var.length());
                        }
                        wg0.T0(wg0Var, sg0Var);
                    } else {
                        ak0Var.requestFocus();
                        wg0.T0(wg0Var, ak0Var);
                    }
                }
                if (wg0Var.F == 0) {
                    vg0Var.u(false);
                    return;
                }
                return;
            case 1:
                vg0 vg0Var2 = this.f35501b;
                vg0Var2.postDelayed(new lg0(vg0Var2, 2), 200L);
                return;
            case 2:
                this.f35501b.h(null);
                return;
            case 3:
                this.f35501b.u(true);
                return;
            default:
                vg0 vg0Var3 = this.f35501b;
                wg0.T0(vg0Var3.V, vg0Var3.f38597b);
                return;
        }
    }
}
