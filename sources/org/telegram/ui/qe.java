package org.telegram.ui;
public final class qe implements Runnable {
    public final int f39849a;
    public final org.telegram.ui.Components.am0 f39850b;

    public qe(org.telegram.ui.Components.am0 am0Var, int i10) {
        this.f39849a = i10;
        this.f39850b = am0Var;
    }

    @Override
    public final void run() {
        switch (this.f39849a) {
            case 0:
                org.telegram.ui.Components.am0 am0Var = this.f39850b;
                if (!am0Var.M) {
                    am0Var.M = true;
                    am0Var.c(new org.telegram.ui.Components.yl0(am0Var, 0), false);
                    am0Var.f24425s.invalidate();
                    return;
                }
                return;
            default:
                this.f39850b.dismiss();
                return;
        }
    }
}
