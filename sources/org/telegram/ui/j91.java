package org.telegram.ui;
public final class j91 implements Runnable {
    public final int f46908a;
    public final k91 f46909b;

    public j91(k91 k91Var, int i7) {
        this.f46908a = i7;
        this.f46909b = k91Var;
    }

    @Override
    public final void run() {
        switch (this.f46908a) {
            case 0:
                k91 k91Var = this.f46909b;
                k91Var.F = null;
                if (k91Var.G != -1) {
                    k91Var.H.getNotificationCenter().j(k91Var.G);
                    k91Var.G = -1;
                    return;
                }
                return;
            default:
                k91 k91Var2 = this.f46909b;
                k91Var2.F = null;
                if (k91Var2.G != -1) {
                    k91Var2.H.getNotificationCenter().j(k91Var2.G);
                    k91Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
