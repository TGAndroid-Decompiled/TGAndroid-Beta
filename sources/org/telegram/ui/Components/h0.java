package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26858a;
    public final i0 f26859b;

    public h0(i0 i0Var, int i10) {
        this.f26858a = i10;
        this.f26859b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26858a) {
            case 0:
                this.f26859b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26859b;
                i0Var.f27116c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
