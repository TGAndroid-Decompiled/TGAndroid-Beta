package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class xr extends t61 {
    public static final int f34836a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        org.telegram.ui.Cells.g9 g9Var = (org.telegram.ui.Cells.g9) view;
        g9Var.c(u61Var.f33249l, u61Var.f33251n, !u61Var.f33247j);
        xh.n nVar = g9Var.f24174a;
        if (u61Var.f33249l instanceof SpannableStringBuilder) {
            nVar.setTextSize(1, 13.0f);
            nVar.setTranslationY(AndroidUtilities.dp(2.0f));
            nVar.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        org.telegram.ui.Cells.g9 g9Var = new org.telegram.ui.Cells.g9(context, u6Var, true);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, g9Var, u6Var);
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        org.telegram.ui.ActionBar.f7.y(g9Var, mutate, org.telegram.ui.ActionBar.y6.L6, u6Var, PorterDuff.Mode.MULTIPLY);
        g9Var.setImage(mutate);
        g9Var.setImageClickListener(new bi.w0(this, context, g9Var, 22));
        return g9Var;
    }
}
