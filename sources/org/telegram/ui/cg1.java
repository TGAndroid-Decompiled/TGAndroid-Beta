package org.telegram.ui;
public final class cg1 implements Runnable {
    public final int f35992a;
    public final dg1 f35993b;

    public cg1(dg1 dg1Var, int i10) {
        this.f35992a = i10;
        this.f35993b = dg1Var;
    }

    @Override
    public final void run() {
        switch (this.f35992a) {
            case 0:
                org.telegram.ui.Components.v61 v61Var = this.f35993b.f32027a;
                if (v61Var != null) {
                    v61Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.v61 v61Var2 = this.f35993b.f32027a;
                if (v61Var2 != null) {
                    v61Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
