package org.telegram.ui;
public final class oe1 implements Runnable {
    public final int f42073a;
    public final pe1 f42074b;

    public oe1(pe1 pe1Var, int i10) {
        this.f42073a = i10;
        this.f42074b = pe1Var;
    }

    @Override
    public final void run() {
        switch (this.f42073a) {
            case 0:
                pe1 pe1Var = this.f42074b;
                pe1Var.F = null;
                if (pe1Var.G != -1) {
                    pe1Var.H.getNotificationCenter().onAnimationFinish(pe1Var.G);
                    pe1Var.G = -1;
                    return;
                }
                return;
            default:
                pe1 pe1Var2 = this.f42074b;
                pe1Var2.F = null;
                if (pe1Var2.G != -1) {
                    pe1Var2.H.getNotificationCenter().onAnimationFinish(pe1Var2.G);
                    pe1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
