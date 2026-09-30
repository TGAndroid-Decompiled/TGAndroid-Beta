package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24708a;
    public final i0 f24709b;

    public h0(i0 i0Var, int i10) {
        this.f24708a = i10;
        this.f24709b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24708a) {
            case 0:
                this.f24709b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24709b;
                i0Var.f24970c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
