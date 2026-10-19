package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dj extends f61 {
    public static final int f25569a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        ej ejVar = (ej) view;
        CharSequence charSequence = g61Var.f26497l;
        CharSequence charSequence2 = g61Var.f26498m;
        ejVar.f25914b.setText(charSequence);
        ejVar.f25915c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ej(context, d6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
