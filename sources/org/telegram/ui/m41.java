package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class m41 extends t51 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final n41 S;

    public m41(n41 n41Var, Context context, Runnable runnable, View view, g51 g51Var, org.telegram.ui.ActionBar.d6 d6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(n41Var.e, context, runnable, view, g51Var, d6Var);
        this.S = n41Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
