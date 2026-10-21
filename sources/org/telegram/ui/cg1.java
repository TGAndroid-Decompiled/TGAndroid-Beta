package org.telegram.ui;
public final class cg1 implements Runnable {
    public final int f35973a;
    public final dg1 f35974b;

    public cg1(dg1 dg1Var, int i10) {
        this.f35973a = i10;
        this.f35974b = dg1Var;
    }

    @Override
    public final void run() {
        switch (this.f35973a) {
            case 0:
                org.telegram.ui.Components.w61 w61Var = this.f35974b.f32356a;
                if (w61Var != null) {
                    w61Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.w61 w61Var2 = this.f35974b.f32356a;
                if (w61Var2 != null) {
                    w61Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
