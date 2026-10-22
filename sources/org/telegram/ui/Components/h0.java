package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26704a;
    public final i0 f26705b;

    public h0(i0 i0Var, int i10) {
        this.f26704a = i10;
        this.f26705b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26704a) {
            case 0:
                this.f26705b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26705b;
                i0Var.f27025c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
