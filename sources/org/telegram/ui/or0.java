package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class or0 extends org.telegram.ui.Cells.a6 {
    public final qr0 F;

    public or0(qr0 qr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = qr0Var;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        if (z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                cn.B8(menu, this.F.d.f49928f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z9) {
        sr0.i0(this.F.d, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        sr0.j0(this.F.d, a6Var);
    }
}
