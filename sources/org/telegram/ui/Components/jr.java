package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class jr extends g51 {
    public static final int f28167a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.c(h51Var.f27375l, h51Var.f27377n, !h51Var.f27373j);
        jh.s sVar = y8Var.f24452a;
        if (h51Var.f27375l instanceof SpannableStringBuilder) {
            sVar.setTextSize(1, 13.0f);
            sVar.setTranslationY(AndroidUtilities.dp(2.0f));
            sVar.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, g6Var, true);
        y8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, g6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6, g6Var), PorterDuff.Mode.MULTIPLY));
        y8Var.setImage(mutate);
        y8Var.setImageClickListener(new eg.o(this, context, y8Var, 22));
        return y8Var;
    }
}
