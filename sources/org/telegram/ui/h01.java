package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class h01 extends n11 {
    public final View R;
    public final TL_stars.TL_starGiftUnique S;
    public final i01 T;

    public h01(i01 i01Var, Context context, Runnable runnable, View view, b11 b11Var, org.telegram.ui.ActionBar.h6 h6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(i01Var.f48528e, context, runnable, view, b11Var, h6Var);
        this.T = i01Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T.f48528e.Y0 = null;
    }
}
