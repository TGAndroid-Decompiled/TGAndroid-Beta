package org.telegram.ui;
public final class je1 implements Runnable {
    public final int f38550a;
    public final ke1 f38551b;

    public je1(ke1 ke1Var, int i10) {
        this.f38550a = i10;
        this.f38551b = ke1Var;
    }

    @Override
    public final void run() {
        switch (this.f38550a) {
            case 0:
                ke1 ke1Var = this.f38551b;
                ke1Var.F = null;
                if (ke1Var.G != -1) {
                    ke1Var.H.getNotificationCenter().onAnimationFinish(ke1Var.G);
                    ke1Var.G = -1;
                    return;
                }
                return;
            default:
                ke1 ke1Var2 = this.f38551b;
                ke1Var2.F = null;
                if (ke1Var2.G != -1) {
                    ke1Var2.H.getNotificationCenter().onAnimationFinish(ke1Var2.G);
                    ke1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
