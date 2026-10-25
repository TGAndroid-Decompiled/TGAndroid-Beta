package org.telegram.ui;

import android.app.Activity;
public final class d60 extends tg.j0 {
    public final e60 X0;

    public d60(e60 e60Var, e60 e60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, i11, activity, e60Var2, u6Var);
        this.X0 = e60Var;
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
