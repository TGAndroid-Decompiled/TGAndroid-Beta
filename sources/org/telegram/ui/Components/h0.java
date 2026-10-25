package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f28752a;
    public final i0 f28753b;

    public h0(i0 i0Var, int i10) {
        this.f28752a = i10;
        this.f28753b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f28752a) {
            case 0:
                this.f28753b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f28753b;
                i0Var.f29079c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
