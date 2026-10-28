package org.telegram.ui;

import android.app.Activity;
public final class f60 extends tg.j0 {
    public final g60 X0;

    public f60(g60 g60Var, g60 g60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, i11, activity, g60Var2, u6Var);
        this.X0 = g60Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.X0.B0 = false;
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.X0.B0 = false;
    }
}
