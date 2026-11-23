package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class mr0 extends org.telegram.ui.Cells.b6 {
    public final or0 G;

    public mr0(or0 or0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = or0Var;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                bn.C8(menu, this.G.d.f51290f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z10) {
        qr0.i0(this.G.d, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        qr0.j0(this.G.d, b6Var);
    }
}
