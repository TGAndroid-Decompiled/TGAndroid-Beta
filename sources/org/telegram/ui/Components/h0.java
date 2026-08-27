package org.telegram.ui.Components;

public final class h0 implements Runnable {

    public final int f28877a;

    public final i0 f28878b;

    public h0(i0 i0Var, int i10) {
        this.f28877a = i10;
        this.f28878b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f28877a) {
            case 0:
                this.f28878b.invalidateSelf();
                break;
            default:
                i0 i0Var = this.f28878b;
                i0Var.f29193c.d(0.0f, true);
                i0Var.invalidateSelf();
                break;
        }
    }
}
