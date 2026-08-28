package org.telegram.ui;
public final class ke implements Runnable {
    public final int f39819a;
    public final org.telegram.ui.Components.ll0 f39820b;

    public ke(org.telegram.ui.Components.ll0 ll0Var, int i9) {
        this.f39819a = i9;
        this.f39820b = ll0Var;
    }

    @Override
    public final void run() {
        switch (this.f39819a) {
            case 0:
                org.telegram.ui.Components.ll0 ll0Var = this.f39820b;
                if (!ll0Var.I) {
                    ll0Var.I = true;
                    ll0Var.c(new org.telegram.ui.Components.jl0(ll0Var, 0), false);
                    ll0Var.f30477s.invalidate();
                    return;
                }
                return;
            default:
                this.f39820b.dismiss();
                return;
        }
    }
}
