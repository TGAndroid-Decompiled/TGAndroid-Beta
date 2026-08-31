package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class g51 extends n61 {
    public final View N;
    public final TL_stars.TL_starGiftUnique O;
    public final h51 P;

    public g51(h51 h51Var, Context context, Runnable runnable, View view, a61 a61Var, org.telegram.ui.ActionBar.g6 g6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(h51Var.f37333e, context, runnable, view, a61Var, g6Var);
        this.P = h51Var;
        this.N = view2;
        this.O = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.P.f37333e.U0 = null;
    }
}
