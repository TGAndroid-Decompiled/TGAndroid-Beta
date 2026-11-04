package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class xm extends org.telegram.ui.Cells.z5 {
    public final org.telegram.ui.n4 G;

    public xm(org.telegram.ui.n4 n4Var, Context context, int i3) {
        super(context, i3, null, null);
        this.G = n4Var;
    }

    @Override
    public final void g(ai.z zVar, ActionMode actionMode) {
        if (zVar.isFocused() && zVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.wm.A8(menu, ((org.telegram.ui.wm) ((an) this.G.f47865e).f38416b.X1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        an.Q((an) this.G.f47865e, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        an.R((an) this.G.f47865e, z5Var);
    }

    @Override
    public final void k(ai.z zVar) {
        ((an) this.G.f47865e).f38416b.h1(zVar, true);
    }
}
