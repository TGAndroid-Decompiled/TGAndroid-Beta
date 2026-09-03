package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class iv0 extends org.telegram.ui.Cells.c6 {
    public final kv0 C;

    public iv0(kv0 kv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.C = kv0Var;
    }

    @Override
    public final void g(eh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                xn.k8(menu, this.C.d.f39098f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z4) {
        mv0.d0(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        mv0.e0(this.C.d, c6Var);
    }
}
