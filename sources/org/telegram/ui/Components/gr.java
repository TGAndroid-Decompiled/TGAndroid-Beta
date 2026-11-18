package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
public final class gr extends k41 {
    public static final int f35552b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.c(l41Var.f37018m, l41Var.f37020o, !l41Var.f37015j);
        xh.l lVar = y8Var.f32484a;
        if (l41Var.f37018m instanceof SpannableStringBuilder) {
            lVar.setTextSize(1, 13.0f);
            lVar.setTranslationY(org.telegram.messenger.g0.L(2.0f));
            lVar.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, i6Var, true);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, y8Var, i6Var);
        Drawable mutate = context.getDrawable(2131232105).mutate();
        org.telegram.ui.ActionBar.u6.x(y8Var, mutate, org.telegram.ui.ActionBar.n6.L6, i6Var, PorterDuff.Mode.MULTIPLY);
        y8Var.setImage(mutate);
        y8Var.setImageClickListener(new ah.h(this, context, y8Var, 28));
        return y8Var;
    }
}
