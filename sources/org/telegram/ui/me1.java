package org.telegram.ui;
public final class me1 implements Runnable {
    public final int f41544a;
    public final ne1 f41545b;

    public me1(ne1 ne1Var, int i10) {
        this.f41544a = i10;
        this.f41545b = ne1Var;
    }

    @Override
    public final void run() {
        switch (this.f41544a) {
            case 0:
                ne1 ne1Var = this.f41545b;
                ne1Var.F = null;
                if (ne1Var.G != -1) {
                    ne1Var.H.getNotificationCenter().onAnimationFinish(ne1Var.G);
                    ne1Var.G = -1;
                    return;
                }
                return;
            default:
                ne1 ne1Var2 = this.f41545b;
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
