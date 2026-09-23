package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class o51 extends v61 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final p51 S;

    public o51(p51 p51Var, Context context, Runnable runnable, View view, i61 i61Var, org.telegram.ui.ActionBar.d6 d6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(p51Var.e, context, runnable, view, i61Var, d6Var);
        this.S = p51Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
