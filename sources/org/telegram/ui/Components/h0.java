package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f25131a;
    public final i0 f25132b;

    public h0(i0 i0Var, int i10) {
        this.f25131a = i10;
        this.f25132b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f25131a) {
            case 0:
                this.f25132b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f25132b;
                i0Var.f25438c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
