package org.telegram.ui;
public final class fe implements Runnable {
    public final int f47674a;
    public final org.telegram.ui.Components.yk0 f47675b;

    public fe(org.telegram.ui.Components.yk0 yk0Var, int i7) {
        this.f47674a = i7;
        this.f47675b = yk0Var;
    }

    @Override
    public final void run() {
        switch (this.f47674a) {
            case 0:
                org.telegram.ui.Components.yk0 yk0Var = this.f47675b;
                if (!yk0Var.N) {
                    yk0Var.N = true;
                    yk0Var.c(new org.telegram.ui.Components.wk0(yk0Var, 0), false);
                    yk0Var.f42450s.invalidate();
                    return;
                }
                return;
            default:
                this.f47675b.dismiss();
                return;
        }
    }
}
