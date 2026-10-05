package org.telegram.ui;
public final class gp0 implements Runnable {
    public final int f36726a;
    public final qp0 f36727b;

    public gp0(qp0 qp0Var, int i10) {
        this.f36726a = i10;
        this.f36727b = qp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f36726a;
        qp0 qp0Var = this.f36727b;
        switch (i10) {
            case 0:
                if (qp0Var.G) {
                    qp0Var.f39831b.invalidate();
                    return;
                }
                return;
            case 1:
                qp0Var.h();
                return;
            case 2:
                int i11 = qp0.f39828q0;
                qp0Var.h();
                return;
            default:
                int i12 = qp0.f39828q0;
                qp0Var.h();
                return;
        }
    }
}
