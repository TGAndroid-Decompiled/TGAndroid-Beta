package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class nn extends org.telegram.ui.Cells.c6 {
    public final pn C;

    public nn(pn pnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.C = pnVar;
    }

    @Override
    public final void g(eh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) this.C.d.f26590b.f29058c0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z4) {
        rn.M(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        rn.N(this.C.d, c6Var);
    }

    @Override
    public final void k(eh.b bVar) {
        this.C.d.f26590b.t1(bVar, true);
    }
}
