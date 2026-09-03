package org.telegram.ui;

import android.app.Activity;
public final class m60 extends fg.v0 {
    public final n60 T0;

    public m60(n60 n60Var, n60 n60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, i11, activity, n60Var2, g6Var);
        this.T0 = n60Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T0.f39203y0 = false;
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.T0.f39203y0 = false;
    }
}
