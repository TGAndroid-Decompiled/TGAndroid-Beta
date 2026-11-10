package org.telegram.ui;
public final class m91 implements Runnable {
    public final int f47866a;
    public final n91 f47867b;

    public m91(n91 n91Var, int i7) {
        this.f47866a = i7;
        this.f47867b = n91Var;
    }

    @Override
    public final void run() {
        switch (this.f47866a) {
            case 0:
                n91 n91Var = this.f47867b;
                n91Var.F = null;
                if (n91Var.G != -1) {
                    n91Var.H.getNotificationCenter().j(n91Var.G);
                    n91Var.G = -1;
                    return;
                }
                return;
            default:
                n91 n91Var2 = this.f47867b;
                n91Var2.F = null;
                if (n91Var2.G != -1) {
                    n91Var2.H.getNotificationCenter().j(n91Var2.G);
                    n91Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
