package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class g01 extends m11 {
    public final View R;
    public final TL_stars.TL_starGiftUnique S;
    public final h01 T;

    public g01(h01 h01Var, Context context, Runnable runnable, View view, a11 a11Var, org.telegram.ui.ActionBar.i6 i6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(h01Var.f48393e, context, runnable, view, a11Var, i6Var);
        this.T = h01Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T.f48393e.Y0 = null;
    }
}
