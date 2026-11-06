package org.telegram.ui;
public final class ge implements Runnable {
    public final int f45984a;
    public final org.telegram.ui.Components.jk0 f45985b;

    public ge(org.telegram.ui.Components.jk0 jk0Var, int i7) {
        this.f45984a = i7;
        this.f45985b = jk0Var;
    }

    @Override
    public final void run() {
        switch (this.f45984a) {
            case 0:
                org.telegram.ui.Components.jk0 jk0Var = this.f45985b;
                if (!jk0Var.M) {
                    jk0Var.M = true;
                    jk0Var.c(new org.telegram.ui.Components.hk0(jk0Var, 0), false);
                    jk0Var.f34990s.invalidate();
                    return;
                }
                return;
            default:
                this.f45985b.dismiss();
                return;
        }
    }
}
