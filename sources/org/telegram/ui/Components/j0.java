package org.telegram.ui.Components;
public final class j0 implements Runnable {
    public final int f29510a;
    public final k0 f29511b;

    public j0(k0 k0Var, int i10) {
        this.f29510a = i10;
        this.f29511b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f29510a) {
            case 0:
                this.f29511b.invalidateSelf();
                return;
            default:
                k0 k0Var = this.f29511b;
                k0Var.f29867c.d(0.0f, true);
                k0Var.invalidateSelf();
                return;
        }
    }
}
