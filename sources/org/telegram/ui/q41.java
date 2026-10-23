package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class q41 extends x51 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final r41 S;

    public q41(r41 r41Var, Context context, Runnable runnable, View view, k51 k51Var, org.telegram.ui.ActionBar.g6 g6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(r41Var.e, context, runnable, view, k51Var, g6Var);
        this.S = r41Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
