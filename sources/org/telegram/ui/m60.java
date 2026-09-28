package org.telegram.ui;

import android.app.Activity;
public final class m60 extends rg.j0 {
    public final n60 W0;

    public m60(n60 n60Var, n60 n60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, i11, activity, n60Var2, d6Var);
        this.W0 = n60Var;
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
