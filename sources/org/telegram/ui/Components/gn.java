package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class gn extends org.telegram.ui.Cells.z5 {
    public final org.telegram.ui.l4 G;

    public gn(org.telegram.ui.l4 l4Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = l4Var;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.an.C8(menu, ((org.telegram.ui.an) ((jn) this.G.f48823e).f33609b.f36424a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z10) {
        jn.R((jn) this.G.f48823e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        jn.S((jn) this.G.f48823e, z5Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((jn) this.G.f48823e).f33609b.h1(uVar, true);
    }
}
