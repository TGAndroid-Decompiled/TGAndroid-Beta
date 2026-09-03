package org.telegram.ui.Components;
public final class i0 implements Runnable {
    public final int f27674a;
    public final j0 f27675b;

    public i0(j0 j0Var, int i10) {
        this.f27674a = i10;
        this.f27675b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f27674a) {
            case 0:
                this.f27675b.invalidateSelf();
                return;
            default:
                j0 j0Var = this.f27675b;
                j0Var.f27927c.d(0.0f, true);
                j0Var.invalidateSelf();
                return;
        }
    }
}
