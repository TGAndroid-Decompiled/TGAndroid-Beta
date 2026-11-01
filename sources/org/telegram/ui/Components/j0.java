package org.telegram.ui.Components;
public final class j0 implements Runnable {
    public final int f27215a;
    public final org.telegram.ui.ActionBar.y2 f27216b;

    public j0(org.telegram.ui.ActionBar.y2 y2Var, int i10) {
        this.f27215a = i10;
        this.f27216b = y2Var;
    }

    @Override
    public final void run() {
        switch (this.f27215a) {
            case 0:
                this.f27216b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.y2 y2Var = this.f27216b;
                ((t5) y2Var.d).e(true, 0.0f);
                y2Var.invalidateSelf();
                return;
        }
    }
}
