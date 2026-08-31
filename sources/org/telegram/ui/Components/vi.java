package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class vi extends i51 {
    public static final int f31911a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        wi wiVar = (wi) view;
        CharSequence charSequence = j51Var.f28014l;
        CharSequence charSequence2 = j51Var.f28015m;
        wiVar.f32755b.setText(charSequence);
        wiVar.f32756c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new wi(context, g6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
