package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hj extends g61 {
    public static final int f27242a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        ij ijVar = (ij) view;
        CharSequence charSequence = h61Var.f27093l;
        CharSequence charSequence2 = h61Var.f27094m;
        ijVar.f27531b.setText(charSequence);
        ijVar.f27532c.setText(charSequence2);
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
