package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

public final class p41 extends w51 {
    public final View M;
    public final TL_stars.TL_starGiftUnique N;
    public final q41 O;

    public p41(q41 q41Var, Context context, Runnable runnable, View view, j51 j51Var, org.telegram.ui.ActionBar.c6 c6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(q41Var.f41521e, context, runnable, view, j51Var, c6Var);
        this.O = q41Var;
        this.M = view2;
        this.N = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.O.f41521e.T0 = null;
    }
}
