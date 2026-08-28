package org.telegram.ui;
public final class he1 implements Runnable {
    public final int f38765a;
    public final ie1 f38766b;

    public he1(ie1 ie1Var, int i9) {
        this.f38765a = i9;
        this.f38766b = ie1Var;
    }

    @Override
    public final void run() {
        switch (this.f38765a) {
            case 0:
                ie1 ie1Var = this.f38766b;
                ie1Var.F = null;
                if (ie1Var.G != -1) {
                    ie1Var.H.getNotificationCenter().onAnimationFinish(ie1Var.G);
                    ie1Var.G = -1;
                    return;
                }
                return;
            default:
                ie1 ie1Var2 = this.f38766b;
                ie1Var2.F = null;
                if (ie1Var2.G != -1) {
                    ie1Var2.H.getNotificationCenter().onAnimationFinish(ie1Var2.G);
                    ie1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
