package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class yq extends m41 {

    public static final int f34947a = 0;

    static {
        m41.setup(new yq());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
        v8Var.c(n41Var.f30844l, n41Var.f30846n, !n41Var.f30842j);
        eh.s sVar = v8Var.f25814a;
        if (n41Var.f30844l instanceof SpannableStringBuilder) {
            sVar.setTextSize(1, 13.0f);
            sVar.setTranslationY(AndroidUtilities.dp(2.0f));
            sVar.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context, c6Var, true);
        v8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
        Drawable drawableMutate = context.getDrawable(R.drawable.msg_copy).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, c6Var), PorterDuff.Mode.MULTIPLY));
        v8Var.setImage(drawableMutate);
        v8Var.setImageClickListener(new gg.f(this, context, v8Var, 24));
        return v8Var;
    }
}
