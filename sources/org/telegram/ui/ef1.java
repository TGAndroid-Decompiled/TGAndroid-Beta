package org.telegram.ui;
public final class ef1 implements Runnable {
    public final int f33802a;
    public final ff1 f33803b;

    public ef1(ff1 ff1Var, int i10) {
        this.f33802a = i10;
        this.f33803b = ff1Var;
    }

    @Override
    public final void run() {
        switch (this.f33802a) {
            case 0:
                ff1 ff1Var = this.f33803b;
                ff1Var.F = null;
                if (ff1Var.G != -1) {
                    ff1Var.H.getNotificationCenter().onAnimationFinish(ff1Var.G);
                    ff1Var.G = -1;
                    return;
                }
                return;
            default:
                ff1 ff1Var2 = this.f33803b;
                ff1Var2.F = null;
                if (ff1Var2.G != -1) {
                    ff1Var2.H.getNotificationCenter().onAnimationFinish(ff1Var2.G);
                    ff1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
