package org.telegram.ui;
public final class kf1 implements Runnable {
    public final int f37974a;
    public final lf1 f37975b;

    public kf1(lf1 lf1Var, int i10) {
        this.f37974a = i10;
        this.f37975b = lf1Var;
    }

    @Override
    public final void run() {
        switch (this.f37974a) {
            case 0:
                lf1 lf1Var = this.f37975b;
                lf1Var.F = null;
                if (lf1Var.G != -1) {
                    lf1Var.H.getNotificationCenter().onAnimationFinish(lf1Var.G);
                    lf1Var.G = -1;
                    return;
                }
                return;
            default:
                lf1 lf1Var2 = this.f37975b;
                lf1Var2.F = null;
                if (lf1Var2.G != -1) {
                    lf1Var2.H.getNotificationCenter().onAnimationFinish(lf1Var2.G);
                    lf1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
