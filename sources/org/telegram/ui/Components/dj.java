package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dj extends l61 {
    public static final int f25661a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        ej ejVar = (ej) view;
        CharSequence charSequence = m61Var.f28559l;
        CharSequence charSequence2 = m61Var.f28560m;
        ejVar.f25982b.setText(charSequence);
        ejVar.f25983c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new ej(context, g6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
