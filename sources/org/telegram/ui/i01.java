package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class i01 extends o11 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final j01 S;

    public i01(j01 j01Var, Context context, Runnable runnable, View view, c11 c11Var, org.telegram.ui.ActionBar.g6 g6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(j01Var.f46808e, context, runnable, view, c11Var, g6Var);
        this.S = j01Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.f46808e.X0 = null;
    }
}
