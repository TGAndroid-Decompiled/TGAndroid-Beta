package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
public final class sq extends w31 {
    public static final int f38115b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        x8Var.c(x31Var.f40180l, x31Var.f40182n, !x31Var.f40178j);
        xh.l lVar = x8Var.f30904a;
        if (x31Var.f40180l instanceof SpannableStringBuilder) {
            lVar.setTextSize(1, 13.0f);
            lVar.setTranslationY(org.telegram.messenger.g0.L(2.0f));
            lVar.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, f6Var, true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, x8Var, f6Var);
        Drawable mutate = context.getDrawable(2131232103).mutate();
        org.telegram.ui.ActionBar.r6.y(x8Var, mutate, org.telegram.ui.ActionBar.k6.L6, f6Var, PorterDuff.Mode.MULTIPLY);
        x8Var.setImage(mutate);
        x8Var.setImageClickListener(new ah.g(this, context, x8Var, 23));
        return x8Var;
    }
}
