package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class ym extends org.telegram.ui.Cells.a6 {
    public final org.telegram.ui.l4 F;

    public ym(org.telegram.ui.l4 l4Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = l4Var;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        if (z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.an.A8(menu, ((org.telegram.ui.an) ((bn) this.F.f47406e).f38948b.W1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z9) {
        bn.Q((bn) this.F.f47406e, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        bn.R((bn) this.F.f47406e, a6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        ((bn) this.F.f47406e).f38948b.h1(z5Var, true);
    }
}
