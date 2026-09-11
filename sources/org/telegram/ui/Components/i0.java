package org.telegram.ui.Components;
public final class i0 implements Runnable {
    public final int f26896a;
    public final j0 f26897b;

    public i0(j0 j0Var, int i10) {
        this.f26896a = i10;
        this.f26897b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f26896a) {
            case 0:
                this.f26897b.invalidateSelf();
                return;
            default:
                j0 j0Var = this.f26897b;
                j0Var.f27293c.d(0.0f, true);
                j0Var.invalidateSelf();
                return;
        }
    }
}
