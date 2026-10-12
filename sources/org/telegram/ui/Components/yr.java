package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class yr extends k61 {
    public static final int f31674a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
        c9Var.c(l61Var.f26954l, l61Var.f26956n, !l61Var.f26952j);
        wh.n nVar = c9Var.f21034a;
        if (l61Var.f26954l instanceof SpannableStringBuilder) {
            nVar.setTextSize(1, 13.0f);
            nVar.setTranslationY(AndroidUtilities.dp(2.0f));
            nVar.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.Cells.c9 c9Var = new org.telegram.ui.Cells.c9(context, c6Var, true);
        c9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, c6Var), PorterDuff.Mode.MULTIPLY));
        c9Var.setImage(mutate);
        c9Var.setImageClickListener(new bi.x(this, context, c9Var, 19));
        return c9Var;
    }
}
