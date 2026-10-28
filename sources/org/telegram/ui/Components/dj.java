package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dj extends t61 {
    public static final int f27472a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ej ejVar = (ej) view;
        CharSequence charSequence = u61Var.f33249l;
        CharSequence charSequence2 = u61Var.f33250m;
        ejVar.f27857b.setText(charSequence);
        ejVar.f27858c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new ej(context, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
