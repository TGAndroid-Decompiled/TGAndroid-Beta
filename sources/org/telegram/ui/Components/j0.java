package org.telegram.ui.Components;
public final class j0 implements Runnable {
    public final int f24178a;
    public final k0 f24179b;

    public j0(k0 k0Var, int i10) {
        this.f24178a = i10;
        this.f24179b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f24178a) {
            case 0:
                this.f24179b.invalidateSelf();
                return;
            default:
                k0 k0Var = this.f24179b;
                k0Var.f24529c.d(0.0f, true);
                k0Var.invalidateSelf();
                return;
        }
    }
}
