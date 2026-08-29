package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class dr extends v41 {
    public static final int f27862a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        w8Var.c(w41Var.f34300l, w41Var.f34302n, !w41Var.f34298j);
        gh.s sVar = w8Var.f25875a;
        if (w41Var.f34300l instanceof SpannableStringBuilder) {
            sVar.setTextSize(1, 13.0f);
            sVar.setTranslationY(AndroidUtilities.dp(2.0f));
            sVar.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context, c6Var, true);
        w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, c6Var), PorterDuff.Mode.MULTIPLY));
        w8Var.setImage(mutate);
        w8Var.setImageClickListener(new bg.q(this, context, w8Var, 25));
        return w8Var;
    }
}
