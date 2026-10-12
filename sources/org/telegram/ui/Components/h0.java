package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26574a;
    public final i0 f26575b;

    public h0(i0 i0Var, int i10) {
        this.f26574a = i10;
        this.f26575b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26574a) {
            case 0:
                this.f26575b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26575b;
                i0Var.f27004c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
