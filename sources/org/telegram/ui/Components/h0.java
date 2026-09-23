package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24466a;
    public final i0 f24467b;

    public h0(i0 i0Var, int i10) {
        this.f24466a = i10;
        this.f24467b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24466a) {
            case 0:
                this.f24467b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24467b;
                i0Var.f24840c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
