package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class i01 extends o11 {
    public final View R;
    public final TL_stars.TL_starGiftUnique S;
    public final j01 T;

    public i01(j01 j01Var, Context context, Runnable runnable, View view, c11 c11Var, org.telegram.ui.ActionBar.h6 h6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(j01Var.f48857e, context, runnable, view, c11Var, h6Var);
        this.T = j01Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T.f48857e.Y0 = null;
    }
}
