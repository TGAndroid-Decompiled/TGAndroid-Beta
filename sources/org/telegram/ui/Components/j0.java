package org.telegram.ui.Components;
public final class j0 implements Runnable {
    public final int f34804a;
    public final org.telegram.ui.ActionBar.u2 f34805b;

    public j0(org.telegram.ui.ActionBar.u2 u2Var, int i7) {
        this.f34804a = i7;
        this.f34805b = u2Var;
    }

    @Override
    public final void run() {
        switch (this.f34804a) {
            case 0:
                this.f34805b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = this.f34805b;
                ((w5) u2Var.d).e(true, 0.0f);
                u2Var.invalidateSelf();
                return;
        }
    }
}
