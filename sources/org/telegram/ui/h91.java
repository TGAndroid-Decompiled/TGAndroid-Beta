package org.telegram.ui;
public final class h91 implements Runnable {
    public final int f47641a;
    public final i91 f47642b;

    public h91(i91 i91Var, int i7) {
        this.f47641a = i7;
        this.f47642b = i91Var;
    }

    @Override
    public final void run() {
        switch (this.f47641a) {
            case 0:
                i91 i91Var = this.f47642b;
                i91Var.F = null;
                if (i91Var.G != -1) {
                    i91Var.H.getNotificationCenter().j(i91Var.G);
                    i91Var.G = -1;
                    return;
                }
                return;
            default:
                i91 i91Var2 = this.f47642b;
                i91Var2.F = null;
                if (i91Var2.G != -1) {
                    i91Var2.H.getNotificationCenter().j(i91Var2.G);
                    i91Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
