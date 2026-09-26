package org.telegram.ui;
public final class qe implements Runnable {
    public final int f36869a;
    public final org.telegram.ui.Components.nm0 f36870b;

    public qe(org.telegram.ui.Components.nm0 nm0Var, int i10) {
        this.f36869a = i10;
        this.f36870b = nm0Var;
    }

    @Override
    public final void run() {
        switch (this.f36869a) {
            case 0:
                org.telegram.ui.Components.nm0 nm0Var = this.f36870b;
                if (!nm0Var.M) {
                    nm0Var.M = true;
                    nm0Var.c(new org.telegram.ui.Components.lm0(nm0Var, 0), false);
                    nm0Var.f26843s.invalidate();
                    return;
                }
                return;
            default:
                this.f36870b.dismiss();
                return;
        }
    }
}
