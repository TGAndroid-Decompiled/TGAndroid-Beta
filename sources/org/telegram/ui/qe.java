package org.telegram.ui;
public final class qe implements Runnable {
    public final int f39875a;
    public final org.telegram.ui.Components.am0 f39876b;

    public qe(org.telegram.ui.Components.am0 am0Var, int i10) {
        this.f39875a = i10;
        this.f39876b = am0Var;
    }

    @Override
    public final void run() {
        switch (this.f39875a) {
            case 0:
                org.telegram.ui.Components.am0 am0Var = this.f39876b;
                if (!am0Var.M) {
                    am0Var.M = true;
                    am0Var.c(new org.telegram.ui.Components.yl0(am0Var, 0), false);
                    am0Var.f24451s.invalidate();
                    return;
                }
                return;
            default:
                this.f39876b.dismiss();
                return;
        }
    }
}
