package org.telegram.ui;

import android.app.Activity;
public final class l60 extends eg.v0 {
    public final m60 T0;

    public l60(m60 m60Var, m60 m60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, i11, activity, m60Var2, f6Var);
        this.T0 = m60Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T0.f36201y0 = false;
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.T0.f36201y0 = false;
    }
}
