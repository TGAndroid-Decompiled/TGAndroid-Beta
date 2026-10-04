package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26966a;
    public final i0 f26967b;

    public h0(i0 i0Var, int i10) {
        this.f26966a = i10;
        this.f26967b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26966a) {
            case 0:
                this.f26967b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26967b;
                i0Var.f27273c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
