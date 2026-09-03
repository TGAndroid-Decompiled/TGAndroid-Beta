package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class l51 extends t61 {
    public final View N;
    public final TL_stars.TL_starGiftUnique O;
    public final m51 P;

    public l51(m51 m51Var, Context context, Runnable runnable, View view, f61 f61Var, org.telegram.ui.ActionBar.f6 f6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(m51Var.e, context, runnable, view, f61Var, f6Var);
        this.P = m51Var;
        this.N = view2;
        this.O = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.P.e.U0 = null;
    }
}
