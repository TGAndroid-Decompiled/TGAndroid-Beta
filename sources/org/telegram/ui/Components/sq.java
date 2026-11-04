package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
public final class sq extends q31 {
    public static final int f38107b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        w8Var.c(r31Var.f37627l, r31Var.f37629n, !r31Var.f37625j);
        yh.l lVar = w8Var.f30822a;
        if (r31Var.f37627l instanceof SpannableStringBuilder) {
            lVar.setTextSize(1, 13.0f);
            lVar.setTranslationY(org.telegram.messenger.g0.L(2.0f));
            lVar.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context, e6Var, true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, w8Var, e6Var);
        Drawable mutate = context.getDrawable(2131232103).mutate();
        org.telegram.ui.ActionBar.r6.y(w8Var, mutate, org.telegram.ui.ActionBar.k6.L6, e6Var, PorterDuff.Mode.MULTIPLY);
        w8Var.setImage(mutate);
        w8Var.setImageClickListener(new ai.h(this, context, w8Var, 28));
        return w8Var;
    }
}
