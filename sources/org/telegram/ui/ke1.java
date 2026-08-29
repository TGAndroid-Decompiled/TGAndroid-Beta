package org.telegram.ui;
public final class ke1 implements Runnable {
    public final int f39846a;
    public final le1 f39847b;

    public ke1(le1 le1Var, int i10) {
        this.f39846a = i10;
        this.f39847b = le1Var;
    }

    @Override
    public final void run() {
        switch (this.f39846a) {
            case 0:
                le1 le1Var = this.f39847b;
                le1Var.F = null;
                if (le1Var.G != -1) {
                    le1Var.H.getNotificationCenter().onAnimationFinish(le1Var.G);
                    le1Var.G = -1;
                    return;
                }
                return;
            default:
                le1 le1Var2 = this.f39847b;
                le1Var2.F = null;
                if (le1Var2.G != -1) {
                    le1Var2.H.getNotificationCenter().onAnimationFinish(le1Var2.G);
                    le1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
