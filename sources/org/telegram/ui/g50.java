package org.telegram.ui;

import android.app.Activity;
public final class g50 extends kg.q0 {
    public final h50 P2;

    public g50(h50 h50Var, h50 h50Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, i11, activity, h50Var2, p6Var);
        this.P2 = h50Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.P2.B0 = false;
    }

    @Override
    public final void w() {
        this.P2.B0 = false;
    }
}
