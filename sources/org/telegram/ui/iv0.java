package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class iv0 extends org.telegram.ui.Cells.h6 {
    public final kv0 F;

    public iv0(kv0 kv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = kv0Var;
    }

    @Override
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        if (g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                un.r8(menu, this.F.d.f41683f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        mv0.e0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        mv0.f0(this.F.d, h6Var);
    }
}
