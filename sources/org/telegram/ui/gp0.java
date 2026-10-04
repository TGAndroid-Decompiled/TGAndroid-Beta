package org.telegram.ui;
public final class gp0 implements Runnable {
    public final int f36697a;
    public final qp0 f36698b;

    public gp0(qp0 qp0Var, int i10) {
        this.f36697a = i10;
        this.f36698b = qp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f36697a;
        qp0 qp0Var = this.f36698b;
        switch (i10) {
            case 0:
                if (qp0Var.G) {
                    qp0Var.f39765b.invalidate();
                    return;
                }
                return;
            case 1:
                qp0Var.h();
                return;
            case 2:
                int i11 = qp0.f39762q0;
                qp0Var.h();
                return;
            default:
                int i12 = qp0.f39762q0;
                qp0Var.h();
                return;
        }
    }
}
