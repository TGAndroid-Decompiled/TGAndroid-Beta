package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26731a;
    public final i0 f26732b;

    public h0(i0 i0Var, int i10) {
        this.f26731a = i10;
        this.f26732b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26731a) {
            case 0:
                this.f26732b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26732b;
                i0Var.f26967c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
