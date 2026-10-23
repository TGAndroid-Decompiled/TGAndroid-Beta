package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class zn extends org.telegram.ui.Cells.d6 {
    public final co F;

    public zn(co coVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = coVar;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) this.F.d.f28366b.f30730f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        fo.P(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        fo.Q(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f28366b.z1(c6Var, true);
    }
}
