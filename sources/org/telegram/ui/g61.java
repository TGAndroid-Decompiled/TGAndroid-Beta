package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class g61 extends n71 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final h61 S;

    public g61(h61 h61Var, Context context, Runnable runnable, View view, a71 a71Var, org.telegram.ui.ActionBar.c6 c6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(h61Var.e, context, runnable, view, a71Var, c6Var);
        this.S = h61Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
