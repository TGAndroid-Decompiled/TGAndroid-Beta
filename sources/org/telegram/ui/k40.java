package org.telegram.ui;

import android.app.Activity;
public final class k40 extends ug.k0 {
    public final l40 T2;

    public k40(l40 l40Var, l40 l40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, i10, activity, l40Var2, i6Var);
        this.T2 = l40Var;
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
