package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class nn extends org.telegram.ui.Cells.a6 {
    public final org.telegram.ui.l4 G;

    public nn(org.telegram.ui.l4 l4Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = l4Var;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) ((qn) this.G.f49583e).f37135b.f39956a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z10) {
        qn.R((qn) this.G.f49583e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.a6 a6Var) {
        qn.S((qn) this.G.f49583e, a6Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((qn) this.G.f49583e).f37135b.i1(uVar, true);
    }
}
