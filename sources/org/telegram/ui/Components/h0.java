package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26720a;
    public final i0 f26721b;

    public h0(i0 i0Var, int i10) {
        this.f26720a = i10;
        this.f26721b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26720a) {
            case 0:
                this.f26721b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26721b;
                i0Var.f26974c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
