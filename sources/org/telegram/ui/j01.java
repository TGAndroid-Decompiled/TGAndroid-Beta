package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class j01 extends p11 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final k01 S;

    public j01(k01 k01Var, Context context, Runnable runnable, View view, d11 d11Var, org.telegram.ui.ActionBar.h6 h6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(k01Var.f47131e, context, runnable, view, d11Var, h6Var);
        this.S = k01Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.f47131e.X0 = null;
    }
}
