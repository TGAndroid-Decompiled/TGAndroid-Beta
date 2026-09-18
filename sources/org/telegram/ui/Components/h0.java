package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24516a;
    public final i0 f24517b;

    public h0(i0 i0Var, int i10) {
        this.f24516a = i10;
        this.f24517b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24516a) {
            case 0:
                this.f24517b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24517b;
                i0Var.f24785c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
