package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
public final class zq extends a41 {
    public static final int f42414b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        w8Var.c(b41Var.f33184l, b41Var.f33186n, !b41Var.f33182j);
        xh.l lVar = w8Var.f31898a;
        if (b41Var.f33184l instanceof SpannableStringBuilder) {
            lVar.setTextSize(1, 13.0f);
            lVar.setTranslationY(org.telegram.messenger.g0.L(2.0f));
            lVar.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context, e6Var, true);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, w8Var, e6Var);
        Drawable mutate = context.getDrawable(2131232104).mutate();
        org.telegram.ui.ActionBar.q6.x(w8Var, mutate, org.telegram.ui.ActionBar.j6.L6, e6Var, PorterDuff.Mode.MULTIPLY);
        w8Var.setImage(mutate);
        w8Var.setImageClickListener(new ah.g(this, context, w8Var, 28));
        return w8Var;
    }
}
