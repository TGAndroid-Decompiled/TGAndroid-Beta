package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hj extends u51 {
    public static final int f23644a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ij ijVar = (ij) view;
        CharSequence charSequence = v51Var.f27829l;
        CharSequence charSequence2 = v51Var.f27830m;
        ijVar.f24036b.setText(charSequence);
        ijVar.f24037c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ij(context, f6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
