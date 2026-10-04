package org.telegram.ui;
public final class gp0 implements Runnable {
    public final int f36702a;
    public final qp0 f36703b;

    public gp0(qp0 qp0Var, int i10) {
        this.f36702a = i10;
        this.f36703b = qp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f36702a;
        qp0 qp0Var = this.f36703b;
        switch (i10) {
            case 0:
                if (qp0Var.G) {
                    qp0Var.f39770b.invalidate();
                    return;
                }
                return;
            case 1:
                qp0Var.h();
                return;
            case 2:
                int i11 = qp0.f39767q0;
                qp0Var.h();
                return;
            default:
                int i12 = qp0.f39767q0;
                qp0Var.h();
                return;
        }
    }
}
