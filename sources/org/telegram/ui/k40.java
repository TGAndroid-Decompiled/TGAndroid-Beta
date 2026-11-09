package org.telegram.ui;

import android.app.Activity;
public final class k40 extends ug.i0 {
    public final l40 P2;

    public k40(l40 l40Var, l40 l40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, i10, activity, l40Var2, g6Var);
        this.P2 = l40Var;
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
