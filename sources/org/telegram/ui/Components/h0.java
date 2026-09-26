package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24581a;
    public final i0 f24582b;

    public h0(i0 i0Var, int i10) {
        this.f24581a = i10;
        this.f24582b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24581a) {
            case 0:
                this.f24582b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24582b;
                i0Var.f24895c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
