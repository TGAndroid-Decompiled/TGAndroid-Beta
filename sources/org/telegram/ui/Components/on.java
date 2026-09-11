package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class on extends org.telegram.ui.Cells.c6 {
    public final rn F;

    public on(rn rnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = rnVar;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.co.k8(menu, ((org.telegram.ui.co) this.F.d.f28753b.f31279f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        tn.M(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        tn.N(this.F.d, c6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        this.F.d.f28753b.t1(b6Var, true);
    }
}
