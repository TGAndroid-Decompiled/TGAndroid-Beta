package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24432a;
    public final i0 f24433b;

    public h0(i0 i0Var, int i10) {
        this.f24432a = i10;
        this.f24433b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24432a) {
            case 0:
                this.f24433b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24433b;
                i0Var.f24762c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
