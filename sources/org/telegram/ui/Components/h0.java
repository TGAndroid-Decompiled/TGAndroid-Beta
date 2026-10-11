package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26911a;
    public final i0 f26912b;

    public h0(i0 i0Var, int i10) {
        this.f26911a = i10;
        this.f26912b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26911a) {
            case 0:
                this.f26912b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26912b;
                i0Var.f27275c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
