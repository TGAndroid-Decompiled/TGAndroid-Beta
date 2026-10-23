package org.telegram.ui;
public final class qe implements Runnable {
    public final int f40788a;
    public final org.telegram.ui.Components.cn0 f40789b;

    public qe(org.telegram.ui.Components.cn0 cn0Var, int i10) {
        this.f40788a = i10;
        this.f40789b = cn0Var;
    }

    @Override
    public final void run() {
        switch (this.f40788a) {
            case 0:
                org.telegram.ui.Components.cn0 cn0Var = this.f40789b;
                if (!cn0Var.M) {
                    cn0Var.M = true;
                    cn0Var.c(new org.telegram.ui.Components.an0(cn0Var, 0), false);
                    cn0Var.f25389s.invalidate();
                    return;
                }
                return;
            default:
                this.f40789b.dismiss();
                return;
        }
    }
}
