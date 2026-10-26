package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class ao extends org.telegram.ui.Cells.h6 {
    public final eo F;

    public ao(eo eoVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = eoVar;
    }

    @Override
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        if (g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.un.r8(menu, ((org.telegram.ui.un) this.F.d.f30215b.f33021f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        go.P(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        go.Q(this.F.d, h6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.g6 g6Var) {
        this.F.d.f30215b.y1(g6Var, true);
    }
}
