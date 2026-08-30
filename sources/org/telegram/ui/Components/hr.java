package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class hr extends h51 {
    public static final int f25477a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.c(i51Var.f25565l, i51Var.f25567n, !i51Var.f25563j);
        ih.s sVar = y8Var.f22622a;
        if (i51Var.f25565l instanceof SpannableStringBuilder) {
            sVar.setTextSize(1, 13.0f);
            sVar.setTranslationY(AndroidUtilities.dp(2.0f));
            sVar.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, f6Var, true);
        y8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var), PorterDuff.Mode.MULTIPLY));
        y8Var.setImage(mutate);
        y8Var.setImageClickListener(new dg.p(this, context, y8Var, 22));
        return y8Var;
    }
}
