package org.telegram.ui;
public final class qe implements Runnable {
    public final int f36870a;
    public final org.telegram.ui.Components.om0 f36871b;

    public qe(org.telegram.ui.Components.om0 om0Var, int i10) {
        this.f36870a = i10;
        this.f36871b = om0Var;
    }

    @Override
    public final void run() {
        switch (this.f36870a) {
            case 0:
                org.telegram.ui.Components.om0 om0Var = this.f36871b;
                if (!om0Var.M) {
                    om0Var.M = true;
                    om0Var.c(new org.telegram.ui.Components.mm0(om0Var, 0), false);
                    om0Var.f27118s.invalidate();
                    return;
                }
                return;
            default:
                this.f36871b.dismiss();
                return;
        }
    }
}
