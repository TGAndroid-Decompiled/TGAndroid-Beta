package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class qr extends u51 {
    public static final int f26476a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        d9Var.c(v51Var.f27829l, v51Var.f27831n, !v51Var.f27827j);
        uh.o oVar = d9Var.f19011a;
        if (v51Var.f27829l instanceof SpannableStringBuilder) {
            oVar.setTextSize(1, 13.0f);
            oVar.setTranslationY(AndroidUtilities.dp(2.0f));
            oVar.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context, f6Var, true);
        d9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var), PorterDuff.Mode.MULTIPLY));
        d9Var.setImage(mutate);
        d9Var.setImageClickListener(new bi.q(this, context, d9Var, 15));
        return d9Var;
    }
}
