package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class g01 extends m11 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final h01 S;

    public g01(h01 h01Var, Context context, Runnable runnable, View view, a11 a11Var, org.telegram.ui.ActionBar.f6 f6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(h01Var.f46179e, context, runnable, view, a11Var, f6Var);
        this.S = h01Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.f46179e.X0 = null;
    }
}
