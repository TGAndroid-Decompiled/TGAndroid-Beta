package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f24582a;
    public final i0 f24583b;

    public h0(i0 i0Var, int i10) {
        this.f24582a = i10;
        this.f24583b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f24582a) {
            case 0:
                this.f24583b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f24583b;
                i0Var.f24896c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
