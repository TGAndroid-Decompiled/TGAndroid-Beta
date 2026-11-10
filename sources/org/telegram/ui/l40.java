package org.telegram.ui;

import android.app.Activity;
public final class l40 extends ug.i0 {
    public final m40 S2;

    public l40(m40 m40Var, m40 m40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, i10, activity, m40Var2, h6Var);
        this.S2 = m40Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S2.B0 = false;
    }

    @Override
    public final void v() {
        this.S2.B0 = false;
    }
}
