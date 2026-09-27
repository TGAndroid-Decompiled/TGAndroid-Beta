package org.telegram.ui;
public final class gp0 implements Runnable {
    public final int f34014a;
    public final qp0 f34015b;

    public gp0(qp0 qp0Var, int i10) {
        this.f34014a = i10;
        this.f34015b = qp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f34014a;
        qp0 qp0Var = this.f34015b;
        switch (i10) {
            case 0:
                if (qp0Var.G) {
                    qp0Var.f36790b.invalidate();
                    return;
                }
                return;
            case 1:
                qp0Var.h();
                return;
            case 2:
                int i11 = qp0.f36787q0;
                qp0Var.h();
                return;
            default:
                int i12 = qp0.f36787q0;
                qp0Var.h();
                return;
        }
    }
}
