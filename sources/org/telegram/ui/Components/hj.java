package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hj extends f61 {
    public static final int f27150a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ij ijVar = (ij) view;
        CharSequence charSequence = g61Var.f26674l;
        CharSequence charSequence2 = g61Var.f26675m;
        ijVar.f27436b.setText(charSequence);
        ijVar.f27437c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ij(context, d6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
