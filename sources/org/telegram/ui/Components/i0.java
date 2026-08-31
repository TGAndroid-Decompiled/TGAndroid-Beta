package org.telegram.ui.Components;
public final class i0 implements Runnable {
    public final int f27632a;
    public final j0 f27633b;

    public i0(j0 j0Var, int i10) {
        this.f27632a = i10;
        this.f27633b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f27632a) {
            case 0:
                this.f27633b.invalidateSelf();
                return;
            default:
                j0 j0Var = this.f27633b;
                j0Var.f27941c.d(0.0f, true);
                j0Var.invalidateSelf();
                return;
        }
    }
}
