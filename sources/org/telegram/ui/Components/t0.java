package org.telegram.ui.Components;
public final class t0 implements Runnable {
    public final int f39741a;
    public final org.telegram.ui.ActionBar.v2 f39742b;

    public t0(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f39741a = i7;
        this.f39742b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f39741a) {
            case 0:
                this.f39742b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = this.f39742b;
                ((d6) v2Var.d).e(true, 0.0f);
                v2Var.invalidateSelf();
                return;
        }
    }
}
