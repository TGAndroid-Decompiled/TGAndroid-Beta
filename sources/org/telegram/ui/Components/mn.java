package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class mn extends org.telegram.ui.Cells.c6 {
    public final on C;

    public mn(on onVar, Context context, int i10) {
        super(context, i10, null, null);
        this.C = onVar;
    }

    @Override
    public final void g(dh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) this.C.d.f24278b.f26689c0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z4) {
        qn.M(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        qn.N(this.C.d, c6Var);
    }

    @Override
    public final void k(dh.b bVar) {
        this.C.d.f24278b.t1(bVar, true);
    }
}
