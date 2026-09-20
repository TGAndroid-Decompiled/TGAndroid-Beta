package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class pn extends org.telegram.ui.Cells.e6 {
    public final sn F;

    public pn(sn snVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = snVar;
    }

    @Override
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        if (d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) this.F.d.f26655b.f29098f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        un.M(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        un.N(this.F.d, e6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.d6 d6Var) {
        this.F.d.f26655b.t1(d6Var, true);
    }
}
