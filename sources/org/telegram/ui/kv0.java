package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class kv0 extends org.telegram.ui.Cells.h6 {
    public final mv0 F;

    public kv0(mv0 mv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = mv0Var;
    }

    @Override
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        if (g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                wn.t8(menu, this.F.d.f42215f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        ov0.e0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        ov0.f0(this.F.d, h6Var);
    }
}
