package org.telegram.ui.Wallet;
public final class a6 implements Runnable {
    public final int f42100a;
    public final c6 f42101b;

    public a6(c6 c6Var, int i7) {
        this.f42100a = i7;
        this.f42101b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f42100a) {
            case 0:
                this.f42101b.performClick();
                return;
            default:
                c6 c6Var = this.f42101b;
                c6Var.h.invalidate();
                c6Var.f42242n.invalidate();
                c6Var.f42232e.invalidate();
                return;
        }
    }
}
