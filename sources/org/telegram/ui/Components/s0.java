package org.telegram.ui.Components;
public final class s0 implements Runnable {
    public final int f39433a;
    public final org.telegram.ui.ActionBar.w2 f39434b;

    public s0(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f39433a = i7;
        this.f39434b = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f39433a) {
            case 0:
                this.f39434b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.f39434b;
                ((c6) w2Var.d).e(true, 0.0f);
                w2Var.invalidateSelf();
                return;
        }
    }
}
