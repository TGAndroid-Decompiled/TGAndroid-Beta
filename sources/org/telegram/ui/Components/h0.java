package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24483a;
    public final i0 f24484b;

    public h0(i0 i0Var, int i10) {
        this.f24483a = i10;
        this.f24484b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24483a) {
            case 0:
                this.f24484b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24484b;
                i0Var.f24835c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
