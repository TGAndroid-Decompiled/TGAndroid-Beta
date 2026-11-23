package org.telegram.ui.Components;
public final class t0 implements Runnable {
    public final int f39696a;
    public final org.telegram.ui.ActionBar.v2 f39697b;

    public t0(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f39696a = i7;
        this.f39697b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f39696a) {
            case 0:
                this.f39697b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = this.f39697b;
                ((d6) v2Var.d).e(true, 0.0f);
                v2Var.invalidateSelf();
                return;
        }
    }
}
