package org.telegram.ui;

import android.app.Activity;

public final class b60 extends ag.i1 {
    public final c60 S0;

    public b60(c60 c60Var, c60 c60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, i11, activity, c60Var2, c6Var);
        this.S0 = c60Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S0.f36974x0 = false;
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.S0.f36974x0 = false;
    }
}
