package org.telegram.ui;
public final class lg0 implements Runnable {
    public final int f39570a;
    public final vg0 f39571b;

    public lg0(vg0 vg0Var, int i10) {
        this.f39570a = i10;
        this.f39571b = vg0Var;
    }

    @Override
    public final void run() {
        switch (this.f39570a) {
            case 0:
                vg0 vg0Var = this.f39571b;
                bk0 bk0Var = vg0Var.f42849a;
                wg0 wg0Var = vg0Var.V;
                sg0 sg0Var = vg0Var.f42850b;
                if (sg0Var != null) {
                    if (wg0Var.f43577c0) {
                        bk0Var.clearFocus();
                        sg0Var.clearFocus();
                    } else if (bk0Var.length() != 0) {
                        sg0Var.requestFocus();
                        if (!vg0Var.R) {
                            sg0Var.setSelection(sg0Var.length());
                        }
                        wg0.T0(wg0Var, sg0Var);
                    } else {
                        bk0Var.requestFocus();
                        wg0.T0(wg0Var, bk0Var);
                    }
                }
                if (wg0Var.F == 0) {
                    vg0Var.s(false);
                    return;
                }
                return;
            case 1:
                vg0 vg0Var2 = this.f39571b;
                vg0Var2.postDelayed(new lg0(vg0Var2, 2), 200L);
                return;
            case 2:
                this.f39571b.h(null);
                return;
            case 3:
                this.f39571b.s(true);
                return;
            default:
                vg0 vg0Var3 = this.f39571b;
                wg0.T0(vg0Var3.V, vg0Var3.f42850b);
                return;
        }
    }
}
