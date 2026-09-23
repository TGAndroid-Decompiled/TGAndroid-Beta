package org.telegram.ui;
public final class ep0 implements Runnable {
    public final int f32995a;
    public final op0 f32996b;

    public ep0(op0 op0Var, int i10) {
        this.f32995a = i10;
        this.f32996b = op0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f32995a;
        op0 op0Var = this.f32996b;
        switch (i10) {
            case 0:
                if (op0Var.G) {
                    op0Var.f35921b.invalidate();
                    return;
                }
                return;
            case 1:
                op0Var.h();
                return;
            case 2:
                int i11 = op0.f35918q0;
                op0Var.h();
                return;
            default:
                int i12 = op0.f35918q0;
                op0Var.h();
                return;
        }
    }
}
