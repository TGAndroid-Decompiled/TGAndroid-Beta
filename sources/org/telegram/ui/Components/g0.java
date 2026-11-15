package org.telegram.ui.Components;
public final class g0 implements Runnable {
    public final int f34766a;
    public final org.telegram.ui.ActionBar.t2 f34767b;

    public g0(org.telegram.ui.ActionBar.t2 t2Var, int i7) {
        this.f34766a = i7;
        this.f34767b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f34766a) {
            case 0:
                this.f34767b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = this.f34767b;
                ((u5) t2Var.d).e(true, 0.0f);
                t2Var.invalidateSelf();
                return;
        }
    }
}
