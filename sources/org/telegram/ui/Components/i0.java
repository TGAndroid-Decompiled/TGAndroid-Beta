package org.telegram.ui.Components;
public final class i0 implements Runnable {
    public final int f26923a;
    public final j0 f26924b;

    public i0(j0 j0Var, int i10) {
        this.f26923a = i10;
        this.f26924b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f26923a) {
            case 0:
                this.f26924b.invalidateSelf();
                return;
            default:
                j0 j0Var = this.f26924b;
                j0Var.f27320c.d(0.0f, true);
                j0Var.invalidateSelf();
                return;
        }
    }
}
