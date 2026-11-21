package org.telegram.ui.Components;
public final class t0 implements Runnable {
    public final int f39749a;
    public final org.telegram.ui.ActionBar.v2 f39750b;

    public t0(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f39749a = i7;
        this.f39750b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f39749a) {
            case 0:
                this.f39750b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = this.f39750b;
                ((d6) v2Var.d).e(true, 0.0f);
                v2Var.invalidateSelf();
                return;
        }
    }
}
