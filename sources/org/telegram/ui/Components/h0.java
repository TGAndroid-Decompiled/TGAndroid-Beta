package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24629a;
    public final i0 f24630b;

    public h0(i0 i0Var, int i10) {
        this.f24629a = i10;
        this.f24630b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24629a) {
            case 0:
                this.f24630b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24630b;
                i0Var.f24922c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
