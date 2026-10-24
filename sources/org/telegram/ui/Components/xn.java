package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class xn extends org.telegram.ui.Cells.d6 {
    public final ao F;

    public xn(ao aoVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = aoVar;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) this.F.d.f27704b.f30146f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        co.P(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        co.Q(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f27704b.z1(c6Var, true);
    }
}
