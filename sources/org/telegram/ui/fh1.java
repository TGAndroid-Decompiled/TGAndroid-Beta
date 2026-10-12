package org.telegram.ui;
public final class fh1 implements org.telegram.ui.ActionBar.z1 {
    public final int f35837a;
    public final oh1 f35838b;

    public fh1(oh1 oh1Var, int i10) {
        this.f35837a = i10;
        this.f35838b = oh1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f35837a) {
            case 0:
                this.f35838b.finishFragment();
                return;
            case 1:
                oh1 oh1Var = this.f35838b;
                oh1Var.B0();
                oh1Var.finishFragment();
                return;
            case 2:
                oh1 oh1Var2 = this.f35838b;
                oh1Var2.R = "";
                oh1Var2.E0(false);
                return;
            case 3:
                oh1.a0(this.f35838b);
                return;
            default:
                oh1.X(this.f35838b);
                return;
        }
    }
}
