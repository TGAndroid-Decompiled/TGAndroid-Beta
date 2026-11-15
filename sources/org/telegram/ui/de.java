package org.telegram.ui;
public final class de implements Runnable {
    public final int f46347a;
    public final org.telegram.ui.Components.ok0 f46348b;

    public de(org.telegram.ui.Components.ok0 ok0Var, int i7) {
        this.f46347a = i7;
        this.f46348b = ok0Var;
    }

    @Override
    public final void run() {
        switch (this.f46347a) {
            case 0:
                org.telegram.ui.Components.ok0 ok0Var = this.f46348b;
                if (!ok0Var.N) {
                    ok0Var.N = true;
                    ok0Var.c(new org.telegram.ui.Components.mk0(ok0Var, 0), false);
                    ok0Var.f38012s.invalidate();
                    return;
                }
                return;
            default:
                this.f46348b.dismiss();
                return;
        }
    }
}
