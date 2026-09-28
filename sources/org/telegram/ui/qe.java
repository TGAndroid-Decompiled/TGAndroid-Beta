package org.telegram.ui;
public final class qe implements Runnable {
    public final int f36871a;
    public final org.telegram.ui.Components.om0 f36872b;

    public qe(org.telegram.ui.Components.om0 om0Var, int i10) {
        this.f36871a = i10;
        this.f36872b = om0Var;
    }

    @Override
    public final void run() {
        switch (this.f36871a) {
            case 0:
                org.telegram.ui.Components.om0 om0Var = this.f36872b;
                if (!om0Var.M) {
                    om0Var.M = true;
                    om0Var.c(new org.telegram.ui.Components.mm0(om0Var, 0), false);
                    om0Var.f27119s.invalidate();
                    return;
                }
                return;
            default:
                this.f36872b.dismiss();
                return;
        }
    }
}
