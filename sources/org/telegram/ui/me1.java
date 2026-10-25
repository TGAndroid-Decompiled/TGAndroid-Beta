package org.telegram.ui;
public final class me1 implements Runnable {
    public final int f41541a;
    public final ne1 f41542b;

    public me1(ne1 ne1Var, int i10) {
        this.f41541a = i10;
        this.f41542b = ne1Var;
    }

    @Override
    public final void run() {
        switch (this.f41541a) {
            case 0:
                ne1 ne1Var = this.f41542b;
                ne1Var.F = null;
                if (ne1Var.G != -1) {
                    ne1Var.H.getNotificationCenter().onAnimationFinish(ne1Var.G);
                    ne1Var.G = -1;
                    return;
                }
                return;
            default:
                ne1 ne1Var2 = this.f41542b;
                ne1Var2.F = null;
                if (ne1Var2.G != -1) {
                    ne1Var2.H.getNotificationCenter().onAnimationFinish(ne1Var2.G);
                    ne1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
