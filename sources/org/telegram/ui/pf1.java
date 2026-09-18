package org.telegram.ui;
public final class pf1 implements Runnable {
    public final int f36471a;
    public final qf1 f36472b;

    public pf1(qf1 qf1Var, int i10) {
        this.f36471a = i10;
        this.f36472b = qf1Var;
    }

    @Override
    public final void run() {
        switch (this.f36471a) {
            case 0:
                qf1 qf1Var = this.f36472b;
                qf1Var.F = null;
                if (qf1Var.G != -1) {
                    qf1Var.H.getNotificationCenter().onAnimationFinish(qf1Var.G);
                    qf1Var.G = -1;
                    return;
                }
                return;
            default:
                qf1 qf1Var2 = this.f36472b;
                qf1Var2.F = null;
                if (qf1Var2.G != -1) {
                    qf1Var2.H.getNotificationCenter().onAnimationFinish(qf1Var2.G);
                    qf1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
