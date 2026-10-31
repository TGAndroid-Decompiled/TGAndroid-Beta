package org.telegram.ui;
public final class db1 implements Runnable {
    public final int f36729a;
    public final eb1 f36730b;

    public db1(eb1 eb1Var, int i10) {
        this.f36729a = i10;
        this.f36730b = eb1Var;
    }

    @Override
    public final void run() {
        switch (this.f36729a) {
            case 0:
                eb1 eb1Var = this.f36730b;
                eb1Var.F = null;
                if (eb1Var.G != -1) {
                    eb1Var.H.getNotificationCenter().j(eb1Var.G);
                    eb1Var.G = -1;
                    return;
                }
                return;
            default:
                eb1 eb1Var2 = this.f36730b;
                eb1Var2.F = null;
                if (eb1Var2.G != -1) {
                    eb1Var2.H.getNotificationCenter().j(eb1Var2.G);
                    eb1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
