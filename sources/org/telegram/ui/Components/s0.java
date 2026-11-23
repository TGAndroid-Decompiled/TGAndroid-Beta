package org.telegram.ui.Components;
public final class s0 implements Runnable {
    public final int f39444a;
    public final org.telegram.ui.ActionBar.v2 f39445b;

    public s0(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f39444a = i7;
        this.f39445b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f39444a) {
            case 0:
                this.f39445b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = this.f39445b;
                ((c6) v2Var.d).e(true, 0.0f);
                v2Var.invalidateSelf();
                return;
        }
    }
}
