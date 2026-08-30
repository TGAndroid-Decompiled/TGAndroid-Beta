package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class e51 extends m61 {
    public final View N;
    public final TL_stars.TL_starGiftUnique O;
    public final f51 P;

    public e51(f51 f51Var, Context context, Runnable runnable, View view, y51 y51Var, org.telegram.ui.ActionBar.f6 f6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(f51Var.e, context, runnable, view, y51Var, f6Var);
        this.P = f51Var;
        this.N = view2;
        this.O = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.P.e.U0 = null;
    }
}
