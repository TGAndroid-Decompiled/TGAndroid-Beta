package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26882a;
    public final i0 f26883b;

    public h0(i0 i0Var, int i10) {
        this.f26882a = i10;
        this.f26883b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26882a) {
            case 0:
                this.f26883b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26883b;
                i0Var.f27185c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
