package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class fj extends k61 {
    public static final int f25061a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        gj gjVar = (gj) view;
        CharSequence charSequence = l61Var.f26954l;
        CharSequence charSequence2 = l61Var.f26955m;
        gjVar.f25298b.setText(charSequence);
        gjVar.f25299c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new gj(context, c6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
