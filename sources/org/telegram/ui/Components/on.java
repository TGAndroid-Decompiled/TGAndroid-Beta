package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class on extends org.telegram.ui.Cells.a6 {
    public final org.telegram.ui.l4 G;

    public on(org.telegram.ui.l4 l4Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = l4Var;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) ((rn) this.G.f49426e).f36766b.f39659a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z10) {
        rn.R((rn) this.G.f49426e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.a6 a6Var) {
        rn.S((rn) this.G.f49426e, a6Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((rn) this.G.f49426e).f36766b.i1(uVar, true);
    }
}
