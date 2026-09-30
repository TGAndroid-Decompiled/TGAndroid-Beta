package org.telegram.ui;
public final class qe implements Runnable {
    public final int f36970a;
    public final org.telegram.ui.Components.pm0 f36971b;

    public qe(org.telegram.ui.Components.pm0 pm0Var, int i10) {
        this.f36970a = i10;
        this.f36971b = pm0Var;
    }

    @Override
    public final void run() {
        switch (this.f36970a) {
            case 0:
                org.telegram.ui.Components.pm0 pm0Var = this.f36971b;
                if (!pm0Var.M) {
                    pm0Var.M = true;
                    pm0Var.c(new org.telegram.ui.Components.nm0(pm0Var, 0), false);
                    pm0Var.f27404s.invalidate();
                    return;
                }
                return;
            default:
                this.f36971b.dismiss();
                return;
        }
    }
}
