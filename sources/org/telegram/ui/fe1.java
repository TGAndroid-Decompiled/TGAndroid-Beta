package org.telegram.ui;
public final class fe1 implements Runnable {
    public final int f36914a;
    public final ge1 f36915b;

    public fe1(ge1 ge1Var, int i10) {
        this.f36914a = i10;
        this.f36915b = ge1Var;
    }

    @Override
    public final void run() {
        switch (this.f36914a) {
            case 0:
                ge1 ge1Var = this.f36915b;
                ge1Var.F = null;
                if (ge1Var.G != -1) {
                    ge1Var.H.getNotificationCenter().onAnimationFinish(ge1Var.G);
                    ge1Var.G = -1;
                    return;
                }
                return;
            default:
                ge1 ge1Var2 = this.f36915b;
                ge1Var2.F = null;
                if (ge1Var2.G != -1) {
                    ge1Var2.H.getNotificationCenter().onAnimationFinish(ge1Var2.G);
                    ge1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
