package org.telegram.ui;

public final class gg1 implements Runnable {

    public final int f38411a;

    public final hg1 f38412b;

    public gg1(hg1 hg1Var, int i10) {
        this.f38411a = i10;
        this.f38412b = hg1Var;
    }

    @Override
    public final void run() {
        switch (this.f38411a) {
            case 0:
                org.telegram.ui.Components.e51 e51Var = this.f38412b.f28261a;
                if (e51Var != null) {
                    e51Var.U2.N(true);
                }
                break;
            default:
                org.telegram.ui.Components.e51 e51Var2 = this.f38412b.f28261a;
                if (e51Var2 != null) {
                    e51Var2.U2.N(true);
                }
                break;
        }
    }
}
