package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ti extends k41 {
    public static final int f32701a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ui uiVar = (ui) view;
        CharSequence charSequence = l41Var.f30339l;
        CharSequence charSequence2 = l41Var.f30340m;
        uiVar.f33030b.setText(charSequence);
        uiVar.f33031c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new ui(context, b6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
