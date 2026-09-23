package org.telegram.ui;
public final class if1 implements Runnable {
    public final int f34130a;
    public final jf1 f34131b;

    public if1(jf1 jf1Var, int i10) {
        this.f34130a = i10;
        this.f34131b = jf1Var;
    }

    @Override
    public final void run() {
        switch (this.f34130a) {
            case 0:
                jf1 jf1Var = this.f34131b;
                jf1Var.F = null;
                if (jf1Var.G != -1) {
                    jf1Var.H.getNotificationCenter().onAnimationFinish(jf1Var.G);
                    jf1Var.G = -1;
                    return;
                }
                return;
            default:
                jf1 jf1Var2 = this.f34131b;
                jf1Var2.F = null;
                if (jf1Var2.G != -1) {
                    jf1Var2.H.getNotificationCenter().onAnimationFinish(jf1Var2.G);
                    jf1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
