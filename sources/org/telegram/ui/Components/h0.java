package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24682a;
    public final i0 f24683b;

    public h0(i0 i0Var, int i10) {
        this.f24682a = i10;
        this.f24683b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24682a) {
            case 0:
                this.f24683b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24683b;
                i0Var.f24972c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
