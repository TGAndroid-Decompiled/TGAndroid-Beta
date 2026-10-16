package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class fj extends l61 {
    public static final int f24759a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        gj gjVar = (gj) view;
        CharSequence charSequence = m61Var.f26946l;
        CharSequence charSequence2 = m61Var.f26947m;
        gjVar.f24986b.setText(charSequence);
        gjVar.f24987c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new gj(context, c6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
