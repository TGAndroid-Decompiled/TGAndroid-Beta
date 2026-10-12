package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class c61 extends j71 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final d61 S;

    public c61(d61 d61Var, Context context, Runnable runnable, View view, w61 w61Var, org.telegram.ui.ActionBar.c6 c6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(d61Var.f36665e, context, runnable, view, w61Var, c6Var);
        this.S = d61Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.f36665e.X0 = null;
    }
}
