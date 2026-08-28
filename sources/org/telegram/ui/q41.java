package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class q41 extends x51 {
    public final View M;
    public final TL_stars.TL_starGiftUnique N;
    public final r41 O;

    public q41(r41 r41Var, Context context, Runnable runnable, View view, k51 k51Var, org.telegram.ui.ActionBar.b6 b6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(r41Var.f42269e, context, runnable, view, k51Var, b6Var);
        this.O = r41Var;
        this.M = view2;
        this.N = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.O.f42269e.T0 = null;
    }
}
