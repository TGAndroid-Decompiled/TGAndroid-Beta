package org.telegram.ui;
public final class qf1 implements Runnable {
    public final int f39864a;
    public final rf1 f39865b;

    public qf1(rf1 rf1Var, int i10) {
        this.f39864a = i10;
        this.f39865b = rf1Var;
    }

    @Override
    public final void run() {
        switch (this.f39864a) {
            case 0:
                rf1 rf1Var = this.f39865b;
                rf1Var.F = null;
                if (rf1Var.G != -1) {
                    rf1Var.H.getNotificationCenter().onAnimationFinish(rf1Var.G);
                    rf1Var.G = -1;
                    return;
                }
                return;
            default:
                rf1 rf1Var2 = this.f39865b;
                rf1Var2.F = null;
                if (rf1Var2.G != -1) {
                    rf1Var2.H.getNotificationCenter().onAnimationFinish(rf1Var2.G);
                    rf1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
