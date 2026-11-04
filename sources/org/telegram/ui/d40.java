package org.telegram.ui;

import android.app.Activity;
public final class d40 extends vg.i0 {
    public final e40 Q2;

    public d40(e40 e40Var, e40 e40Var2, Activity activity, int i3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, i10, activity, e40Var2, e6Var);
        this.Q2 = e40Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Q2.C0 = false;
    }

    @Override
    public final void v() {
        this.Q2.C0 = false;
    }
}
