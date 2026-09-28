package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24652a;
    public final i0 f24653b;

    public h0(i0 i0Var, int i10) {
        this.f24652a = i10;
        this.f24653b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24652a) {
            case 0:
                this.f24653b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24653b;
                i0Var.f24957c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
