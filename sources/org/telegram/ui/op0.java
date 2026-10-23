package org.telegram.ui;
public final class op0 extends org.telegram.ui.ActionBar.j {
    public final vp0 f40239a;

    public op0(vp0 vp0Var) {
        this.f40239a = vp0Var;
    }

    @Override
    public final void b(int i10) {
        vp0 vp0Var = this.f40239a;
        if (i10 == -1) {
            vp0Var.finishFragment();
        } else if (i10 == 1) {
            if (vp0Var.V != null) {
                vp0Var.finishFragment(false);
                vp0Var.V.b();
            }
        } else if (i10 == 2) {
            vp0.U(vp0Var, null);
        }
    }
}
