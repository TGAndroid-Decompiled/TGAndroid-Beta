package org.telegram.ui;
public final class lg0 implements Runnable {
    public final int f38350a;
    public final vg0 f38351b;

    public lg0(vg0 vg0Var, int i10) {
        this.f38350a = i10;
        this.f38351b = vg0Var;
    }

    @Override
    public final void run() {
        switch (this.f38350a) {
            case 0:
                vg0 vg0Var = this.f38351b;
                ck0 ck0Var = vg0Var.f41536a;
                wg0 wg0Var = vg0Var.V;
                sg0 sg0Var = vg0Var.f41537b;
                if (sg0Var != null) {
                    if (wg0Var.f42364c0) {
                        ck0Var.clearFocus();
                        sg0Var.clearFocus();
                    } else if (ck0Var.length() != 0) {
                        sg0Var.requestFocus();
                        if (!vg0Var.R) {
                            sg0Var.setSelection(sg0Var.length());
                        }
                        wg0.T0(wg0Var, sg0Var);
                    } else {
                        ck0Var.requestFocus();
                        wg0.T0(wg0Var, ck0Var);
                    }
                }
                if (wg0Var.F == 0) {
                    vg0Var.u(false);
                    return;
                }
                return;
            case 1:
                vg0 vg0Var2 = this.f38351b;
                vg0Var2.postDelayed(new lg0(vg0Var2, 2), 200L);
                return;
            case 2:
                this.f38351b.h(null);
                return;
            case 3:
                this.f38351b.u(true);
                return;
            default:
                vg0 vg0Var3 = this.f38351b;
                wg0.T0(vg0Var3.V, vg0Var3.f41537b);
                return;
        }
    }
}
