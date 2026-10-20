package org.telegram.ui;
public final class cg1 implements Runnable {
    public final int f35972a;
    public final dg1 f35973b;

    public cg1(dg1 dg1Var, int i10) {
        this.f35972a = i10;
        this.f35973b = dg1Var;
    }

    @Override
    public final void run() {
        switch (this.f35972a) {
            case 0:
                org.telegram.ui.Components.w61 w61Var = this.f35973b.f32355a;
                if (w61Var != null) {
                    w61Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.w61 w61Var2 = this.f35973b.f32355a;
                if (w61Var2 != null) {
                    w61Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
