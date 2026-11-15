package org.telegram.ui;
public final class de implements Runnable {
    public final int f46375a;
    public final org.telegram.ui.Components.ok0 f46376b;

    public de(org.telegram.ui.Components.ok0 ok0Var, int i7) {
        this.f46375a = i7;
        this.f46376b = ok0Var;
    }

    @Override
    public final void run() {
        switch (this.f46375a) {
            case 0:
                org.telegram.ui.Components.ok0 ok0Var = this.f46376b;
                if (!ok0Var.N) {
                    ok0Var.N = true;
                    ok0Var.c(new org.telegram.ui.Components.mk0(ok0Var, 0), false);
                    ok0Var.f38014s.invalidate();
                    return;
                }
                return;
            default:
                this.f46376b.dismiss();
                return;
        }
    }
}
