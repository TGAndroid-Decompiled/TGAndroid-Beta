package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class go extends org.telegram.ui.Cells.d6 {
    public final jo F;

    public go(jo joVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = joVar;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.n8(menu, ((org.telegram.ui.zn) this.F.d.f30211b.f33235f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        lo.P(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        lo.Q(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f30211b.w1(c6Var, true);
    }
}
