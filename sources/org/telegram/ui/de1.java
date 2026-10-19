package org.telegram.ui;
public final class de1 implements Runnable {
    public final int f36376a;
    public final ee1 f36377b;

    public de1(ee1 ee1Var, int i10) {
        this.f36376a = i10;
        this.f36377b = ee1Var;
    }

    @Override
    public final void run() {
        switch (this.f36376a) {
            case 0:
                ee1 ee1Var = this.f36377b;
                ee1Var.F = null;
                if (ee1Var.G != -1) {
                    ee1Var.H.getNotificationCenter().onAnimationFinish(ee1Var.G);
                    ee1Var.G = -1;
                    return;
                }
                return;
            default:
                ee1 ee1Var2 = this.f36377b;
                ee1Var2.F = null;
                if (ee1Var2.G != -1) {
                    ee1Var2.H.getNotificationCenter().onAnimationFinish(ee1Var2.G);
                    ee1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
