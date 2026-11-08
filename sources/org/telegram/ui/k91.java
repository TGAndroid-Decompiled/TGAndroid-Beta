package org.telegram.ui;
public final class k91 implements Runnable {
    public final int f47148a;
    public final l91 f47149b;

    public k91(l91 l91Var, int i7) {
        this.f47148a = i7;
        this.f47149b = l91Var;
    }

    @Override
    public final void run() {
        switch (this.f47148a) {
            case 0:
                l91 l91Var = this.f47149b;
                l91Var.F = null;
                if (l91Var.G != -1) {
                    l91Var.H.getNotificationCenter().j(l91Var.G);
                    l91Var.G = -1;
                    return;
                }
                return;
            default:
                l91 l91Var2 = this.f47149b;
                l91Var2.F = null;
                if (l91Var2.G != -1) {
                    l91Var2.H.getNotificationCenter().j(l91Var2.G);
                    l91Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
