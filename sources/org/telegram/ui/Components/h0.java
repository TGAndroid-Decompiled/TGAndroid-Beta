package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24575a;
    public final i0 f24576b;

    public h0(i0 i0Var, int i10) {
        this.f24575a = i10;
        this.f24576b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24575a) {
            case 0:
                this.f24576b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24576b;
                i0Var.f24870c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
