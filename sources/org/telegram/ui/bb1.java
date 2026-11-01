package org.telegram.ui;
public final class bb1 implements Runnable {
    public final int f36022a;
    public final cb1 f36023b;

    public bb1(cb1 cb1Var, int i10) {
        this.f36022a = i10;
        this.f36023b = cb1Var;
    }

    @Override
    public final void run() {
        switch (this.f36022a) {
            case 0:
                cb1 cb1Var = this.f36023b;
                cb1Var.F = null;
                if (cb1Var.G != -1) {
                    cb1Var.H.getNotificationCenter().j(cb1Var.G);
                    cb1Var.G = -1;
                    return;
                }
                return;
            default:
                cb1 cb1Var2 = this.f36023b;
                cb1Var2.F = null;
                if (cb1Var2.G != -1) {
                    cb1Var2.H.getNotificationCenter().j(cb1Var2.G);
                    cb1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
