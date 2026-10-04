package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26961a;
    public final i0 f26962b;

    public h0(i0 i0Var, int i10) {
        this.f26961a = i10;
        this.f26962b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26961a) {
            case 0:
                this.f26962b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26962b;
                i0Var.f27268c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
