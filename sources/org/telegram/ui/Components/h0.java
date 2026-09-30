package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24653a;
    public final i0 f24654b;

    public h0(i0 i0Var, int i10) {
        this.f24653a = i10;
        this.f24654b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24653a) {
            case 0:
                this.f24654b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24654b;
                i0Var.f24937c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
