package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class p51 extends w61 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final q51 S;

    public p51(q51 q51Var, Context context, Runnable runnable, View view, j61 j61Var, org.telegram.ui.ActionBar.d6 d6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(q51Var.e, context, runnable, view, j61Var, d6Var);
        this.S = q51Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
