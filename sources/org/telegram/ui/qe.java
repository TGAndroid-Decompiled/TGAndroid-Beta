package org.telegram.ui;
public final class qe implements Runnable {
    public final int f36870a;
    public final org.telegram.ui.Components.mm0 f36871b;

    public qe(org.telegram.ui.Components.mm0 mm0Var, int i10) {
        this.f36870a = i10;
        this.f36871b = mm0Var;
    }

    @Override
    public final void run() {
        switch (this.f36870a) {
            case 0:
                org.telegram.ui.Components.mm0 mm0Var = this.f36871b;
                if (!mm0Var.M) {
                    mm0Var.M = true;
                    mm0Var.c(new org.telegram.ui.Components.km0(mm0Var, 0), false);
                    mm0Var.f26547s.invalidate();
                    return;
                }
                return;
            default:
                this.f36871b.dismiss();
                return;
        }
    }
}
