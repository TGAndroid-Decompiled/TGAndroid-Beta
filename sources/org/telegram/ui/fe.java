package org.telegram.ui;
public final class fe implements Runnable {
    public final int f47643a;
    public final org.telegram.ui.Components.wk0 f47644b;

    public fe(org.telegram.ui.Components.wk0 wk0Var, int i7) {
        this.f47643a = i7;
        this.f47644b = wk0Var;
    }

    @Override
    public final void run() {
        switch (this.f47643a) {
            case 0:
                org.telegram.ui.Components.wk0 wk0Var = this.f47644b;
                if (!wk0Var.N) {
                    wk0Var.N = true;
                    wk0Var.c(new org.telegram.ui.Components.uk0(wk0Var, 0), false);
                    wk0Var.f41731s.invalidate();
                    return;
                }
                return;
            default:
                this.f47644b.dismiss();
                return;
        }
    }
}
