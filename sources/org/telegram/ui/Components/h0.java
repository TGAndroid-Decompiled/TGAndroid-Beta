package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26754a;
    public final i0 f26755b;

    public h0(i0 i0Var, int i10) {
        this.f26754a = i10;
        this.f26755b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26754a) {
            case 0:
                this.f26755b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26755b;
                i0Var.f27082c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
