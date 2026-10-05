package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f27024a;
    public final i0 f27025b;

    public h0(i0 i0Var, int i10) {
        this.f27024a = i10;
        this.f27025b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f27024a) {
            case 0:
                this.f27025b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f27025b;
                i0Var.f27349c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
