package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
public final class ir extends n41 {
    public static final int f36302b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.c(o41Var.f38091m, o41Var.f38093o, !o41Var.f38088j);
        xh.l lVar = y8Var.f32515a;
        if (o41Var.f38091m instanceof SpannableStringBuilder) {
            lVar.setTextSize(1, 13.0f);
            lVar.setTranslationY(org.telegram.messenger.g0.L(2.0f));
            lVar.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, h6Var, true);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, y8Var, h6Var);
        Drawable mutate = context.getDrawable(2131232105).mutate();
        org.telegram.ui.ActionBar.t6.x(y8Var, mutate, org.telegram.ui.ActionBar.m6.L6, h6Var, PorterDuff.Mode.MULTIPLY);
        y8Var.setImage(mutate);
        y8Var.setImageClickListener(new ah.h(this, context, y8Var, 28));
        return y8Var;
    }
}
