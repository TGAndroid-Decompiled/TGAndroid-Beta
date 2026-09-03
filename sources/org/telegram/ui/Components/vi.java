package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class vi extends g51 {
    public static final int f31889a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        wi wiVar = (wi) view;
        CharSequence charSequence = h51Var.f27375l;
        CharSequence charSequence2 = h51Var.f27376m;
        wiVar.f32760b.setText(charSequence);
        wiVar.f32761c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new wi(context, g6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
