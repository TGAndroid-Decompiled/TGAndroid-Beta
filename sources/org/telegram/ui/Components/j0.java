package org.telegram.ui.Components;
public final class j0 implements Runnable {
    public final int f34891a;
    public final org.telegram.ui.ActionBar.u2 f34892b;

    public j0(org.telegram.ui.ActionBar.u2 u2Var, int i7) {
        this.f34891a = i7;
        this.f34892b = u2Var;
    }

    @Override
    public final void run() {
        switch (this.f34891a) {
            case 0:
                this.f34892b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = this.f34892b;
                ((w5) u2Var.d).e(true, 0.0f);
                u2Var.invalidateSelf();
                return;
        }
    }
}
