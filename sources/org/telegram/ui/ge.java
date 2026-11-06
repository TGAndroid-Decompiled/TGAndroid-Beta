package org.telegram.ui;
public final class ge implements Runnable {
    public final int f45958a;
    public final org.telegram.ui.Components.jk0 f45959b;

    public ge(org.telegram.ui.Components.jk0 jk0Var, int i7) {
        this.f45958a = i7;
        this.f45959b = jk0Var;
    }

    @Override
    public final void run() {
        switch (this.f45958a) {
            case 0:
                org.telegram.ui.Components.jk0 jk0Var = this.f45959b;
                if (!jk0Var.M) {
                    jk0Var.M = true;
                    jk0Var.c(new org.telegram.ui.Components.hk0(jk0Var, 0), false);
                    jk0Var.f35003s.invalidate();
                    return;
                }
                return;
            default:
                this.f45959b.dismiss();
                return;
        }
    }
}
