package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class d01 extends j11 {
    public final View R;
    public final TL_stars.TL_starGiftUnique S;
    public final e01 T;

    public d01(e01 e01Var, Context context, Runnable runnable, View view, x01 x01Var, org.telegram.ui.ActionBar.e6 e6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(e01Var.f46519e, context, runnable, view, x01Var, e6Var);
        this.T = e01Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T.f46519e.Y0 = null;
    }
}
