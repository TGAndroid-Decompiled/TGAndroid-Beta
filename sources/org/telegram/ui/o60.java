package org.telegram.ui;

import android.app.Activity;
public final class o60 extends rg.j0 {
    public final p60 W0;

    public o60(p60 p60Var, p60 p60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, i11, activity, p60Var2, d6Var);
        this.W0 = p60Var;
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
