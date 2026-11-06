package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class kr0 extends org.telegram.ui.Cells.a6 {
    public final mr0 F;

    public kr0(mr0 mr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = mr0Var;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        if (z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                an.A8(menu, this.F.d.f48516f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z9) {
        or0.i0(this.F.d, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        or0.j0(this.F.d, a6Var);
    }
}
