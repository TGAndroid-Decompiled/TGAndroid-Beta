package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
public final class sq extends x31 {
    public static final int f38138b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        x8Var.c(y31Var.f40568l, y31Var.f40570n, !y31Var.f40566j);
        xh.l lVar = x8Var.f30909a;
        if (y31Var.f40568l instanceof SpannableStringBuilder) {
            lVar.setTextSize(1, 13.0f);
            lVar.setTranslationY(org.telegram.messenger.g0.L(2.0f));
            lVar.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, g6Var, true);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, x8Var, g6Var);
        Drawable mutate = context.getDrawable(2131232103).mutate();
        org.telegram.ui.ActionBar.s6.x(x8Var, mutate, org.telegram.ui.ActionBar.l6.L6, g6Var, PorterDuff.Mode.MULTIPLY);
        x8Var.setImage(mutate);
        x8Var.setImageClickListener(new ah.g(this, context, x8Var, 23));
        return x8Var;
    }
}
