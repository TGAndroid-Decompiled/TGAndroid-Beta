package org.telegram.ui;
public final class ef1 implements Runnable {
    public final int f36485a;
    public final ff1 f36486b;

    public ef1(ff1 ff1Var, int i10) {
        this.f36485a = i10;
        this.f36486b = ff1Var;
    }

    @Override
    public final void run() {
        switch (this.f36485a) {
            case 0:
                ff1 ff1Var = this.f36486b;
                ff1Var.F = null;
                if (ff1Var.G != -1) {
                    ff1Var.H.getNotificationCenter().onAnimationFinish(ff1Var.G);
                    ff1Var.G = -1;
                    return;
                }
                return;
            default:
                ff1 ff1Var2 = this.f36486b;
                ff1Var2.F = null;
                if (ff1Var2.G != -1) {
                    ff1Var2.H.getNotificationCenter().onAnimationFinish(ff1Var2.G);
                    ff1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
