package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
public final class br extends a51 {
    public static final int f24912b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        z8Var.d(b51Var.f24643l, b51Var.f24645n, !b51Var.f24641j);
        nh.p pVar = z8Var.f23649a;
        if (b51Var.f24643l instanceof SpannableStringBuilder) {
            pVar.setTextSize(1, 13.0f);
            pVar.setTranslationY(org.telegram.messenger.i0.L(2.0f));
            pVar.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, p6Var, true);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, z8Var, p6Var);
        Drawable mutate = context.getDrawable(2131232102).mutate();
        org.telegram.ui.ActionBar.a7.y(z8Var, mutate, org.telegram.ui.ActionBar.t6.L6, p6Var, PorterDuff.Mode.MULTIPLY);
        z8Var.setImage(mutate);
        z8Var.setImageClickListener(new ag.i(this, context, z8Var, 13));
        return z8Var;
    }
}
