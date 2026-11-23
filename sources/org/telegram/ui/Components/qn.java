package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class qn extends org.telegram.ui.Cells.b6 {
    public final org.telegram.ui.l4 G;

    public qn(org.telegram.ui.l4 l4Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = l4Var;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) ((tn) this.G.f49452e).f37477b.f40352a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z10) {
        tn.R((tn) this.G.f49452e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        tn.S((tn) this.G.f49452e, b6Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((tn) this.G.f49452e).f37477b.i1(uVar, true);
    }
}
