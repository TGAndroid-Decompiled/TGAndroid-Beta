package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class yr extends l61 {
    public static final int f31351a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
        c9Var.c(m61Var.f26946l, m61Var.f26948n, !m61Var.f26944j);
        wh.n nVar = c9Var.f20728a;
        if (m61Var.f26946l instanceof SpannableStringBuilder) {
            nVar.setTextSize(1, 13.0f);
            nVar.setTranslationY(AndroidUtilities.dp(2.0f));
            nVar.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.Cells.c9 c9Var = new org.telegram.ui.Cells.c9(context, c6Var, true);
        c9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var));
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, c6Var), PorterDuff.Mode.MULTIPLY));
        c9Var.setImage(mutate);
        c9Var.setImageClickListener(new bi.x(this, context, c9Var, 19));
        return c9Var;
    }
}
