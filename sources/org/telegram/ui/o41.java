package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class o41 extends v51 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final p41 S;

    public o41(p41 p41Var, Context context, Runnable runnable, View view, i51 i51Var, org.telegram.ui.ActionBar.d6 d6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(p41Var.e, context, runnable, view, i51Var, d6Var);
        this.S = p41Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
