package org.telegram.ui.Components;

import android.content.Context;

public final class fu0 extends eu0 {
    public final gu0 C;

    public fu0(gu0 gu0Var, Context context, int i10) {
        super(gu0Var.f28828e, context, i10, false);
        this.C = gu0Var;
    }

    @Override
    public final void l() {
        super.l();
        gu0 gu0Var = this.C;
        hu0 hu0Var = gu0Var.f28828e;
        int i10 = gu0Var.f28825a;
        int[] iArr = hu0.Z1;
        zs0 zs0VarW = hu0Var.W(i10);
        if (zs0VarW != null && zs0VarW.f35340r.getVisibility() == 0) {
            gu0Var.d.l();
        }
        if (zs0VarW != null) {
            pr0 pr0Var = zs0VarW.f35342w;
            jh.j6 j6Var = this.f28155s;
            pr0Var.e(j6Var != null && (j6Var.k() || (hu0Var.i0() && this.f28155s.g() > 0)), true);
        }
    }
}
