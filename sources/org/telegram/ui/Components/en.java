package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

public final class en extends org.telegram.ui.Cells.z5 {
    public final gn B;

    public en(gn gnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.B = gnVar;
    }

    @Override
    public final void g(gh.r rVar, ActionMode actionMode) {
        if (rVar.isFocused() && rVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) == null) {
                return;
            }
            org.telegram.ui.rn.k8(menu, ((org.telegram.ui.rn) this.B.d.f34900b.f28635b0).h, false, true, true, true);
        }
    }

    @Override
    public final void i(boolean z10) {
        in.M(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        in.N(this.B.d, z5Var);
    }

    @Override
    public final void k(gh.r rVar) {
        this.B.d.f34900b.t1(rVar, true);
    }
}
