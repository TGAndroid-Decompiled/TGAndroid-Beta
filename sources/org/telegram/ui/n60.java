package org.telegram.ui;

import android.app.Activity;
public final class n60 extends eg.v0 {
    public final o60 T0;

    public n60(o60 o60Var, o60 o60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, i11, activity, o60Var2, f6Var);
        this.T0 = o60Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T0.f36662y0 = false;
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.T0.f36662y0 = false;
    }
}
