package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class a61 extends h71 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final b61 S;

    public a61(b61 b61Var, Context context, Runnable runnable, View view, u61 u61Var, org.telegram.ui.ActionBar.f6 f6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(b61Var.e, context, runnable, view, u61Var, f6Var);
        this.S = b61Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
