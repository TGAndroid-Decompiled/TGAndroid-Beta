package org.telegram.ui;

import android.app.Activity;
public final class h50 extends kg.q0 {
    public final i50 P2;

    public h50(i50 i50Var, i50 i50Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, i11, activity, i50Var2, p6Var);
        this.P2 = i50Var;
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
