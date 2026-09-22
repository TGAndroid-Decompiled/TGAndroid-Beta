package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24661a;
    public final i0 f24662b;

    public h0(i0 i0Var, int i10) {
        this.f24661a = i10;
        this.f24662b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24661a) {
            case 0:
                this.f24662b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24662b;
                i0Var.f24912c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
