package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26705a;
    public final i0 f26706b;

    public h0(i0 i0Var, int i10) {
        this.f26705a = i10;
        this.f26706b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26705a) {
            case 0:
                this.f26706b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26706b;
                i0Var.f27026c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
