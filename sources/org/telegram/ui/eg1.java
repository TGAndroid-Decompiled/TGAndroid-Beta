package org.telegram.ui;
public final class eg1 implements Runnable {
    public final int f36531a;
    public final fg1 f36532b;

    public eg1(fg1 fg1Var, int i10) {
        this.f36531a = i10;
        this.f36532b = fg1Var;
    }

    @Override
    public final void run() {
        switch (this.f36531a) {
            case 0:
                org.telegram.ui.Components.u61 u61Var = this.f36532b.f31190a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.u61 u61Var2 = this.f36532b.f31190a;
                if (u61Var2 != null) {
                    u61Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
