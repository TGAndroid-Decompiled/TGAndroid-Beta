package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26960a;
    public final i0 f26961b;

    public h0(i0 i0Var, int i10) {
        this.f26960a = i10;
        this.f26961b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26960a) {
            case 0:
                this.f26961b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26961b;
                i0Var.f27267c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
