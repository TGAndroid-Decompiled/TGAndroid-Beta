package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f28754a;
    public final i0 f28755b;

    public h0(i0 i0Var, int i10) {
        this.f28754a = i10;
        this.f28755b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f28754a) {
            case 0:
                this.f28755b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f28755b;
                i0Var.f29081c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
