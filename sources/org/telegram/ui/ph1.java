package org.telegram.ui;
public final class ph1 implements Runnable {
    public final int f40907a;
    public final qh1 f40908b;

    public ph1(qh1 qh1Var, int i10) {
        this.f40907a = i10;
        this.f40908b = qh1Var;
    }

    @Override
    public final void run() {
        switch (this.f40907a) {
            case 0:
                org.telegram.ui.Components.f71 f71Var = this.f40908b.f26675a;
                if (f71Var != null) {
                    f71Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.f71 f71Var2 = this.f40908b.f26675a;
                if (f71Var2 != null) {
                    f71Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
