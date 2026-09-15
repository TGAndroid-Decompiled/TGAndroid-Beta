package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24480a;
    public final i0 f24481b;

    public h0(i0 i0Var, int i10) {
        this.f24480a = i10;
        this.f24481b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24480a) {
            case 0:
                this.f24481b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24481b;
                i0Var.f24829c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
