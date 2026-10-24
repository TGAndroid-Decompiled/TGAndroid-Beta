package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class tr extends k61 {
    public static final int f30877a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
        c9Var.c(l61Var.f28227l, l61Var.f28229n, !l61Var.f28225j);
        wh.n nVar = c9Var.f22216a;
        if (l61Var.f28227l instanceof SpannableStringBuilder) {
            nVar.setTextSize(1, 13.0f);
            nVar.setTranslationY(AndroidUtilities.dp(2.0f));
            nVar.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.Cells.c9 c9Var = new org.telegram.ui.Cells.c9(context, g6Var, true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, c9Var, g6Var);
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        org.telegram.ui.ActionBar.r6.z(c9Var, mutate, org.telegram.ui.ActionBar.k6.L6, g6Var, PorterDuff.Mode.MULTIPLY);
        c9Var.setImage(mutate);
        c9Var.setImageClickListener(new ai.v0(this, context, c9Var, 22));
        return c9Var;
    }
}
