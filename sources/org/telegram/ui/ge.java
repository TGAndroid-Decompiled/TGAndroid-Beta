package org.telegram.ui;
public final class ge implements Runnable {
    public final int f45986a;
    public final org.telegram.ui.Components.jk0 f45987b;

    public ge(org.telegram.ui.Components.jk0 jk0Var, int i7) {
        this.f45986a = i7;
        this.f45987b = jk0Var;
    }

    @Override
    public final void run() {
        switch (this.f45986a) {
            case 0:
                org.telegram.ui.Components.jk0 jk0Var = this.f45987b;
                if (!jk0Var.M) {
                    jk0Var.M = true;
                    jk0Var.c(new org.telegram.ui.Components.hk0(jk0Var, 0), false);
                    jk0Var.f35011s.invalidate();
                    return;
                }
                return;
            default:
                this.f45987b.dismiss();
                return;
        }
    }
}
