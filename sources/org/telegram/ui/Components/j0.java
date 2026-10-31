package org.telegram.ui.Components;
public final class j0 implements Runnable {
    public final int f27161a;
    public final org.telegram.ui.ActionBar.y2 f27162b;

    public j0(org.telegram.ui.ActionBar.y2 y2Var, int i10) {
        this.f27161a = i10;
        this.f27162b = y2Var;
    }

    @Override
    public final void run() {
        switch (this.f27161a) {
            case 0:
                this.f27162b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.y2 y2Var = this.f27162b;
                ((t5) y2Var.d).e(true, 0.0f);
                y2Var.invalidateSelf();
                return;
        }
    }
}
