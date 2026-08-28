package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ar extends k41 {
    public static final int f26888a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        z8Var.c(l41Var.f30339l, l41Var.f30341n, !l41Var.f30337j);
        dh.u uVar = z8Var.f26035a;
        if (l41Var.f30339l instanceof SpannableStringBuilder) {
            uVar.setTextSize(1, 13.0f);
            uVar.setTranslationY(AndroidUtilities.dp(2.0f));
            uVar.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, b6Var, true);
        z8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, b6Var), PorterDuff.Mode.MULTIPLY));
        z8Var.setImage(mutate);
        z8Var.setImageClickListener(new fg.f(this, context, z8Var, 24));
        return z8Var;
    }
}
