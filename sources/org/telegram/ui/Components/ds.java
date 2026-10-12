package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ds extends t61 {
    public static final int f25458a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
        c9Var.c(u61Var.f31071l, u61Var.f31073n, !u61Var.f31069j);
        vh.n nVar = c9Var.f21694a;
        if (u61Var.f31071l instanceof SpannableStringBuilder) {
            nVar.setTextSize(1, 13.0f);
            nVar.setTranslationY(AndroidUtilities.dp(2.0f));
            nVar.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.Cells.c9 c9Var = new org.telegram.ui.Cells.c9(context, c6Var, true);
        c9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, c6Var), PorterDuff.Mode.MULTIPLY));
        c9Var.setImage(mutate);
        c9Var.setImageClickListener(new ai.d0(this, context, c9Var, 19));
        return c9Var;
    }
}
