package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class br0 extends org.telegram.ui.Cells.z5 {
    public final dr0 G;

    public br0(dr0 dr0Var, Context context, int i3) {
        super(context, i3, null, null);
        this.G = dr0Var;
    }

    @Override
    public final void g(ai.z zVar, ActionMode actionMode) {
        if (zVar.isFocused() && zVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                wm.A8(menu, this.G.d.f45336f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        fr0.i0(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        fr0.j0(this.G.d, z5Var);
    }
}
