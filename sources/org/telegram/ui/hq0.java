package org.telegram.ui;
public final class hq0 extends org.telegram.ui.ActionBar.j {
    public final oq0 f36633a;

    public hq0(oq0 oq0Var) {
        this.f36633a = oq0Var;
    }

    @Override
    public final void b(int i10) {
        oq0 oq0Var = this.f36633a;
        if (i10 == -1) {
            oq0Var.finishFragment();
        } else if (i10 == 1) {
            if (oq0Var.V != null) {
                oq0Var.finishFragment(false);
                oq0Var.V.b();
            }
        } else if (i10 == 2) {
            oq0.U(oq0Var, null);
        }
    }
}
