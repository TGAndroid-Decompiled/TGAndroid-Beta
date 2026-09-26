package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class fj extends u51 {
    public static final int f24200a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        gj gjVar = (gj) view;
        CharSequence charSequence = v51Var.f29048l;
        CharSequence charSequence2 = v51Var.f29049m;
        gjVar.f24472b.setText(charSequence);
        gjVar.f24473c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new gj(context, d6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
