package org.telegram.ui.Components;

import android.content.Context;

public final class os0 extends eu0 {
    public final hu0 C;

    public os0(hu0 hu0Var, Context context) {
        super(hu0Var, context, 0, false);
        this.C = hu0Var;
    }

    @Override
    public final void l() {
        super.l();
        hu0 hu0Var = this.C;
        zs0 zs0VarW = hu0Var.W(8);
        if (zs0VarW != null && zs0VarW.f35340r.getVisibility() == 0) {
            hu0Var.W.l();
        }
        if (zs0VarW != null) {
            pr0 pr0Var = zs0VarW.f35342w;
            jh.j6 j6Var = this.f28155s;
            pr0Var.e(j6Var != null && (j6Var.k() || (hu0Var.i0() && this.f28155s.g() > 0)), true);
        }
    }
}
