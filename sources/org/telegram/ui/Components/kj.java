package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class kj extends t61 {
    public static final int f27870a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        lj ljVar = (lj) view;
        CharSequence charSequence = u61Var.f31071l;
        CharSequence charSequence2 = u61Var.f31072m;
        ljVar.f28207b.setText(charSequence);
        ljVar.f28208c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new lj(context, c6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
