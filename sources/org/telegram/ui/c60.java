package org.telegram.ui;

import android.app.Activity;
public final class c60 extends sg.j0 {
    public final d60 X0;

    public c60(d60 d60Var, d60 d60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, i11, activity, d60Var2, g6Var);
        this.X0 = d60Var;
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
