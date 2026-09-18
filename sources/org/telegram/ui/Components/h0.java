package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24435a;
    public final i0 f24436b;

    public h0(i0 i0Var, int i10) {
        this.f24435a = i10;
        this.f24436b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24435a) {
            case 0:
                this.f24436b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24436b;
                i0Var.f24765c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
