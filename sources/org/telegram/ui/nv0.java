package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class nv0 extends org.telegram.ui.Cells.d6 {
    public final pv0 F;

    public nv0(pv0 pv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = pv0Var;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                wn.k8(menu, this.F.d.f37503f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        rv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        rv0.e0(this.F.d, d6Var);
    }
}
