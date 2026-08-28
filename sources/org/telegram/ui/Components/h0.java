package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f28905a;
    public final i0 f28906b;

    public h0(i0 i0Var, int i9) {
        this.f28905a = i9;
        this.f28906b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f28905a) {
            case 0:
                this.f28906b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f28906b;
                i0Var.f29253c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
