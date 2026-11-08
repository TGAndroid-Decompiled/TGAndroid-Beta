package org.telegram.ui.Components;
public final class j0 implements Runnable {
    public final int f34853a;
    public final org.telegram.ui.ActionBar.u2 f34854b;

    public j0(org.telegram.ui.ActionBar.u2 u2Var, int i7) {
        this.f34853a = i7;
        this.f34854b = u2Var;
    }

    @Override
    public final void run() {
        switch (this.f34853a) {
            case 0:
                this.f34854b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = this.f34854b;
                ((w5) u2Var.d).e(true, 0.0f);
                u2Var.invalidateSelf();
                return;
        }
    }
}
