package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f26822a;
    public final i0 f26823b;

    public h0(i0 i0Var, int i10) {
        this.f26822a = i10;
        this.f26823b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f26822a) {
            case 0:
                this.f26823b.invalidateSelf();
                return;
            default:
                i0 i0Var = this.f26823b;
                i0Var.f27214c.d(0.0f, true);
                i0Var.invalidateSelf();
                return;
        }
    }
}
