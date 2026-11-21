package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class lr0 extends org.telegram.ui.Cells.b6 {
    public final nr0 G;

    public lr0(nr0 nr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = nr0Var;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                bn.C8(menu, this.G.d.f50938f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z10) {
        pr0.i0(this.G.d, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        pr0.j0(this.G.d, b6Var);
    }
}
