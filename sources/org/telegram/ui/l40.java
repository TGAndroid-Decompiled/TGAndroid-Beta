package org.telegram.ui;

import android.app.Activity;
public final class l40 extends ug.l0 {
    public final m40 T2;

    public l40(m40 m40Var, m40 m40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, i10, activity, m40Var2, i6Var);
        this.T2 = m40Var;
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
