package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26578a;
    public final i0 f26579b;

    public h0(i0 i0Var, int i10) {
        this.f26578a = i10;
        this.f26579b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26578a) {
            case 0:
                this.f26579b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26579b;
                i0Var.f26989c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
