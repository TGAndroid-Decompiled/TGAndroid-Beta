package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class nr0 extends org.telegram.ui.Cells.a6 {
    public final pr0 F;

    public nr0(pr0 pr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = pr0Var;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        if (z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                cn.B8(menu, this.F.d.f49574f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z9) {
        rr0.i0(this.F.d, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        rr0.j0(this.F.d, a6Var);
    }
}
