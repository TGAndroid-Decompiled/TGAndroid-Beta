package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24509a;
    public final i0 f24510b;

    public h0(i0 i0Var, int i10) {
        this.f24509a = i10;
        this.f24510b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24509a) {
            case 0:
                this.f24510b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24510b;
                i0Var.f24802c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
