package org.telegram.ui;
public final class fe implements Runnable {
    public final int f47601a;
    public final org.telegram.ui.Components.wk0 f47602b;

    public fe(org.telegram.ui.Components.wk0 wk0Var, int i7) {
        this.f47601a = i7;
        this.f47602b = wk0Var;
    }

    @Override
    public final void run() {
        switch (this.f47601a) {
            case 0:
                org.telegram.ui.Components.wk0 wk0Var = this.f47602b;
                if (!wk0Var.N) {
                    wk0Var.N = true;
                    wk0Var.c(new org.telegram.ui.Components.uk0(wk0Var, 0), false);
                    wk0Var.f41731s.invalidate();
                    return;
                }
                return;
            default:
                this.f47602b.dismiss();
                return;
        }
    }
}
