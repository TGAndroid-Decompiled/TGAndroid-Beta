package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26701a;
    public final i0 f26702b;

    public h0(i0 i0Var, int i10) {
        this.f26701a = i10;
        this.f26702b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26701a) {
            case 0:
                this.f26702b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26702b;
                i0Var.f27022c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
