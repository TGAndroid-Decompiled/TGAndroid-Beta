package org.telegram.ui;
public final class ge implements Runnable {
    public final int f46073a;
    public final org.telegram.ui.Components.jk0 f46074b;

    public ge(org.telegram.ui.Components.jk0 jk0Var, int i7) {
        this.f46073a = i7;
        this.f46074b = jk0Var;
    }

    @Override
    public final void run() {
        switch (this.f46073a) {
            case 0:
                org.telegram.ui.Components.jk0 jk0Var = this.f46074b;
                if (!jk0Var.M) {
                    jk0Var.M = true;
                    jk0Var.c(new org.telegram.ui.Components.hk0(jk0Var, 0), false);
                    jk0Var.f34958s.invalidate();
                    return;
                }
                return;
            default:
                this.f46074b.dismiss();
                return;
        }
    }
}
