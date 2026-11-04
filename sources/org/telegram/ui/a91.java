package org.telegram.ui;
public final class a91 implements Runnable {
    public final int f43691a;
    public final b91 f43692b;

    public a91(b91 b91Var, int i3) {
        this.f43691a = i3;
        this.f43692b = b91Var;
    }

    @Override
    public final void run() {
        switch (this.f43691a) {
            case 0:
                b91 b91Var = this.f43692b;
                b91Var.F = null;
                if (b91Var.G != -1) {
                    b91Var.H.getNotificationCenter().j(b91Var.G);
                    b91Var.G = -1;
                    return;
                }
                return;
            default:
                b91 b91Var2 = this.f43692b;
                b91Var2.F = null;
                if (b91Var2.G != -1) {
                    b91Var2.H.getNotificationCenter().j(b91Var2.G);
                    b91Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
