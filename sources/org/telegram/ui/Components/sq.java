package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
public final class sq extends q31 {
    public static final int f38135b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        x8Var.c(r31Var.f37598l, r31Var.f37600n, !r31Var.f37596j);
        xh.l lVar = x8Var.f30899a;
        if (r31Var.f37598l instanceof SpannableStringBuilder) {
            lVar.setTextSize(1, 13.0f);
            lVar.setTranslationY(org.telegram.messenger.g0.L(2.0f));
            lVar.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, f6Var, true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, x8Var, f6Var);
        Drawable mutate = context.getDrawable(2131232103).mutate();
        org.telegram.ui.ActionBar.r6.y(x8Var, mutate, org.telegram.ui.ActionBar.k6.L6, f6Var, PorterDuff.Mode.MULTIPLY);
        x8Var.setImage(mutate);
        x8Var.setImageClickListener(new ah.g(this, context, x8Var, 23));
        return x8Var;
    }
}
