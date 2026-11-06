package org.telegram.ui;

import android.app.Activity;
public final class i40 extends ug.i0 {
    public final j40 P2;

    public i40(j40 j40Var, j40 j40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, i10, activity, j40Var2, f6Var);
        this.P2 = j40Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.P2.B0 = false;
    }

    @Override
    public final void v() {
        this.P2.B0 = false;
    }
}
