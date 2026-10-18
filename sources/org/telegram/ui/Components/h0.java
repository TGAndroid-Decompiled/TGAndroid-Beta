package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26727a;
    public final i0 f26728b;

    public h0(i0 i0Var, int i10) {
        this.f26727a = i10;
        this.f26728b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26727a) {
            case 0:
                this.f26728b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26728b;
                i0Var.f26981c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
