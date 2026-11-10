package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
public final class rq extends w31 {
    public static final int f37722b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        x8Var.c(x31Var.f40156l, x31Var.f40158n, !x31Var.f40154j);
        xh.l lVar = x8Var.f30920a;
        if (x31Var.f40156l instanceof SpannableStringBuilder) {
            lVar.setTextSize(1, 13.0f);
            lVar.setTranslationY(org.telegram.messenger.g0.L(2.0f));
            lVar.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, h6Var, true);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, x8Var, h6Var);
        Drawable mutate = context.getDrawable(2131232103).mutate();
        org.telegram.ui.ActionBar.t6.x(x8Var, mutate, org.telegram.ui.ActionBar.m6.L6, h6Var, PorterDuff.Mode.MULTIPLY);
        x8Var.setImage(mutate);
        x8Var.setImageClickListener(new ah.g(this, context, x8Var, 23));
        return x8Var;
    }
}
