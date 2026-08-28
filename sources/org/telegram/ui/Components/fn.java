package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class fn extends org.telegram.ui.Cells.c6 {
    public final hn B;

    public fn(hn hnVar, Context context, int i9) {
        super(context, i9, null, null);
        this.B = hnVar;
    }

    @Override
    public final void g(fh.s sVar, ActionMode actionMode) {
        if (sVar.isFocused() && sVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.qn.k8(menu, ((org.telegram.ui.qn) this.B.d.f27493b.f30099b0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        jn.L(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        jn.M(this.B.d, c6Var);
    }

    @Override
    public final void k(fh.s sVar) {
        this.B.d.f27493b.t1(sVar, true);
    }
}
