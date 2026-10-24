package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class p41 extends w51 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final q41 S;

    public p41(q41 q41Var, Context context, Runnable runnable, View view, j51 j51Var, org.telegram.ui.ActionBar.g6 g6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(q41Var.e, context, runnable, view, j51Var, g6Var);
        this.S = q41Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
