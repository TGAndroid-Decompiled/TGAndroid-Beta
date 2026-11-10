package org.telegram.ui.Components;
public final class i0 implements Runnable {
    public final int f34492a;
    public final org.telegram.ui.ActionBar.v2 f34493b;

    public i0(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f34492a = i7;
        this.f34493b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f34492a) {
            case 0:
                this.f34493b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = this.f34493b;
                ((v5) v2Var.d).e(true, 0.0f);
                v2Var.invalidateSelf();
                return;
        }
    }
}
