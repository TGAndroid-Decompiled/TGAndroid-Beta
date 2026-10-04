package org.telegram.ui;

import android.app.Activity;
public final class q60 extends rg.k0 {
    public final r60 W0;

    public q60(r60 r60Var, r60 r60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, i11, activity, r60Var2, d6Var);
        this.W0 = r60Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.W0.B0 = false;
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.W0.B0 = false;
    }
}
