package org.telegram.ui;
public final class ie1 implements Runnable {
    public final int f38276a;
    public final je1 f38277b;

    public ie1(je1 je1Var, int i10) {
        this.f38276a = i10;
        this.f38277b = je1Var;
    }

    @Override
    public final void run() {
        switch (this.f38276a) {
            case 0:
                je1 je1Var = this.f38277b;
                je1Var.F = null;
                if (je1Var.G != -1) {
                    je1Var.H.getNotificationCenter().onAnimationFinish(je1Var.G);
                    je1Var.G = -1;
                    return;
                }
                return;
            default:
                je1 je1Var2 = this.f38277b;
                je1Var2.F = null;
                if (je1Var2.G != -1) {
                    je1Var2.H.getNotificationCenter().onAnimationFinish(je1Var2.G);
                    je1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
