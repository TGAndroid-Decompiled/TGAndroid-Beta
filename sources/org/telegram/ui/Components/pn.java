package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class pn extends org.telegram.ui.Cells.d6 {
    public final sn F;

    public pn(sn snVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = snVar;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) this.F.d.f26688b.f29021f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        un.M(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        un.N(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f26688b.t1(c6Var, true);
    }
}
