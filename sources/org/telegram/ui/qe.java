package org.telegram.ui;
public final class qe implements Runnable {
    public final int f39876a;
    public final org.telegram.ui.Components.am0 f39877b;

    public qe(org.telegram.ui.Components.am0 am0Var, int i10) {
        this.f39876a = i10;
        this.f39877b = am0Var;
    }

    @Override
    public final void run() {
        switch (this.f39876a) {
            case 0:
                org.telegram.ui.Components.am0 am0Var = this.f39877b;
                if (!am0Var.M) {
                    am0Var.M = true;
                    am0Var.c(new org.telegram.ui.Components.yl0(am0Var, 0), false);
                    am0Var.f24452s.invalidate();
                    return;
                }
                return;
            default:
                this.f39877b.dismiss();
                return;
        }
    }
}
