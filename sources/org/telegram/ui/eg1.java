package org.telegram.ui;
public final class eg1 implements Runnable {
    public final int f36535a;
    public final fg1 f36536b;

    public eg1(fg1 fg1Var, int i10) {
        this.f36535a = i10;
        this.f36536b = fg1Var;
    }

    @Override
    public final void run() {
        switch (this.f36535a) {
            case 0:
                org.telegram.ui.Components.u61 u61Var = this.f36536b.f31197a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.u61 u61Var2 = this.f36536b.f31197a;
                if (u61Var2 != null) {
                    u61Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
