package org.telegram.ui;
public final class hg1 implements Runnable {
    public final int f38786a;
    public final ig1 f38787b;

    public hg1(ig1 ig1Var, int i9) {
        this.f38786a = i9;
        this.f38787b = ig1Var;
    }

    @Override
    public final void run() {
        switch (this.f38786a) {
            case 0:
                org.telegram.ui.Components.c51 c51Var = this.f38787b.f27658a;
                if (c51Var != null) {
                    c51Var.U2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.c51 c51Var2 = this.f38787b.f27658a;
                if (c51Var2 != null) {
                    c51Var2.U2.N(true);
                    return;
                }
                return;
        }
    }
}
