package org.telegram.ui;
public final class qe implements Runnable {
    public final int f40552a;
    public final org.telegram.ui.Components.ym0 f40553b;

    public qe(org.telegram.ui.Components.ym0 ym0Var, int i10) {
        this.f40552a = i10;
        this.f40553b = ym0Var;
    }

    @Override
    public final void run() {
        switch (this.f40552a) {
            case 0:
                org.telegram.ui.Components.ym0 ym0Var = this.f40553b;
                if (!ym0Var.M) {
                    ym0Var.M = true;
                    ym0Var.c(new org.telegram.ui.Components.wm0(ym0Var, 0), false);
                    ym0Var.f32701s.invalidate();
                    return;
                }
                return;
            default:
                this.f40553b.dismiss();
                return;
        }
    }
}
