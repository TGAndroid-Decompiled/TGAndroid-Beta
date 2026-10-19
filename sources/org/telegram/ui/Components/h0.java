package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26733a;
    public final i0 f26734b;

    public h0(i0 i0Var, int i10) {
        this.f26733a = i10;
        this.f26734b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26733a) {
            case 0:
                this.f26734b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26734b;
                i0Var.f26969c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
