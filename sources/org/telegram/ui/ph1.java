package org.telegram.ui;
public final class ph1 implements Runnable {
    public final int f40873a;
    public final qh1 f40874b;

    public ph1(qh1 qh1Var, int i10) {
        this.f40873a = i10;
        this.f40874b = qh1Var;
    }

    @Override
    public final void run() {
        switch (this.f40873a) {
            case 0:
                org.telegram.ui.Components.g71 g71Var = this.f40874b.f26922a;
                if (g71Var != null) {
                    g71Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.g71 g71Var2 = this.f40874b.f26922a;
                if (g71Var2 != null) {
                    g71Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
