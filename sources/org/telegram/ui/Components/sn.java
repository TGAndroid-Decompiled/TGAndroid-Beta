package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class sn extends org.telegram.ui.Cells.d6 {
    public final vn F;

    public sn(vn vnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = vnVar;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.wn.k8(menu, ((org.telegram.ui.wn) this.F.d.f27362b.f30270f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        xn.M(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        xn.N(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f27362b.t1(c6Var, true);
    }
}
