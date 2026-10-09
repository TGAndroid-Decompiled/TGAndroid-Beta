package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26915a;
    public final i0 f26916b;

    public h0(i0 i0Var, int i10) {
        this.f26915a = i10;
        this.f26916b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26915a) {
            case 0:
                this.f26916b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26916b;
                i0Var.f27172c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
