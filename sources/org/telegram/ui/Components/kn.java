package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class kn extends org.telegram.ui.Cells.a6 {
    public final mn B;

    public kn(mn mnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.B = mnVar;
    }

    @Override
    public final void g(bh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.tn.k8(menu, ((org.telegram.ui.tn) this.B.d.f28403b.f30990b0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        on.L(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        on.M(this.B.d, a6Var);
    }

    @Override
    public final void k(bh.b bVar) {
        this.B.d.f28403b.t1(bVar, true);
    }
}
