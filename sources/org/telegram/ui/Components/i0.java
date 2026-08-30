package org.telegram.ui.Components;
public final class i0 implements Runnable {
    public final int f25531a;
    public final j0 f25532b;

    public i0(j0 j0Var, int i10) {
        this.f25531a = i10;
        this.f25532b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f25531a) {
            case 0:
                this.f25532b.invalidateSelf();
                return;
            default:
                j0 j0Var = this.f25532b;
                j0Var.f25812c.d(0.0f, true);
                j0Var.invalidateSelf();
                return;
        }
    }
}
