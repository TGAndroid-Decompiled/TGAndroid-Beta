package org.telegram.ui;
public final class ge implements Runnable {
    public final int f45979a;
    public final org.telegram.ui.Components.kk0 f45980b;

    public ge(org.telegram.ui.Components.kk0 kk0Var, int i7) {
        this.f45979a = i7;
        this.f45980b = kk0Var;
    }

    @Override
    public final void run() {
        switch (this.f45979a) {
            case 0:
                org.telegram.ui.Components.kk0 kk0Var = this.f45980b;
                if (!kk0Var.M) {
                    kk0Var.M = true;
                    kk0Var.c(new org.telegram.ui.Components.ik0(kk0Var, 0), false);
                    kk0Var.f35367s.invalidate();
                    return;
                }
                return;
            default:
                this.f45980b.dismiss();
                return;
        }
    }
}
