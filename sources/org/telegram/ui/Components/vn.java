package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class vn extends org.telegram.ui.Cells.e6 {
    public final xn F;

    public vn(xn xnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = xnVar;
    }

    @Override
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        if (d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.eo.k8(menu, ((org.telegram.ui.eo) this.F.d.f26422b.f29366f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        zn.M(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zn.N(this.F.d, e6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.d6 d6Var) {
        this.F.d.f26422b.t1(d6Var, true);
    }
}
