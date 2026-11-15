package org.telegram.ui;

import android.app.Activity;
public final class i40 extends ug.j0 {
    public final j40 T2;

    public i40(j40 j40Var, j40 j40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, i10, activity, j40Var2, e6Var);
        this.T2 = j40Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T2.C0 = false;
    }

    @Override
    public final void v() {
        this.T2.C0 = false;
    }
}
