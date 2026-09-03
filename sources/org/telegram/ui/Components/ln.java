package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class ln extends org.telegram.ui.Cells.b6 {
    public final nn C;

    public ln(nn nnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.C = nnVar;
    }

    @Override
    public final void g(dh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) this.C.d.f24282b.f26685c0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z4) {
        pn.M(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.b6 b6Var) {
        pn.N(this.C.d, b6Var);
    }

    @Override
    public final void k(dh.b bVar) {
        this.C.d.f24282b.t1(bVar, true);
    }
}
