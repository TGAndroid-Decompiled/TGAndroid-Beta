package org.telegram.ui;
public final class ee implements Runnable {
    public final int f44969a;
    public final org.telegram.ui.Components.nk0 f44970b;

    public ee(org.telegram.ui.Components.nk0 nk0Var, int i3) {
        this.f44969a = i3;
        this.f44970b = nk0Var;
    }

    @Override
    public final void run() {
        switch (this.f44969a) {
            case 0:
                org.telegram.ui.Components.nk0 nk0Var = this.f44970b;
                if (!nk0Var.N) {
                    nk0Var.N = true;
                    nk0Var.c(new org.telegram.ui.Components.lk0(nk0Var, 0), false);
                    nk0Var.f36579s.invalidate();
                    return;
                }
                return;
            default:
                this.f44970b.dismiss();
                return;
        }
    }
}
