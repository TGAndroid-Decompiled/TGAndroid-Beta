package org.telegram.ui.Components;
public final class g0 implements Runnable {
    public final int f34762a;
    public final org.telegram.ui.ActionBar.t2 f34763b;

    public g0(org.telegram.ui.ActionBar.t2 t2Var, int i7) {
        this.f34762a = i7;
        this.f34763b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f34762a) {
            case 0:
                this.f34763b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = this.f34763b;
                ((u5) t2Var.d).e(true, 0.0f);
                t2Var.invalidateSelf();
                return;
        }
    }
}
