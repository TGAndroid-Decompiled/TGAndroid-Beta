package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dj extends g61 {
    public static final int f25506a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ej ejVar = (ej) view;
        CharSequence charSequence = h61Var.f26782l;
        CharSequence charSequence2 = h61Var.f26783m;
        ejVar.f25910b.setText(charSequence);
        ejVar.f25911c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ej(context, d6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
