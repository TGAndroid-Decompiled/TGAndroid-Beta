package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class gn extends org.telegram.ui.Cells.e6 {
    public final fg.j F;

    public gn(fg.j jVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = jVar;
    }

    @Override
    public final void g(ih.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.un.x8(menu, ((org.telegram.ui.un) ((jn) this.F.e).f30964b.W1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        jn.P((jn) this.F.e, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        jn.Q((jn) this.F.e, e6Var);
    }

    @Override
    public final void k(ih.b bVar) {
        ((jn) this.F.e).f30964b.g1(bVar, true);
    }
}
