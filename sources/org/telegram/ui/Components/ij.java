package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ij extends q61 {
    public static final int f27361a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        jj jjVar = (jj) view;
        CharSequence charSequence = r61Var.f30361l;
        CharSequence charSequence2 = r61Var.f30362m;
        jjVar.f27697b.setText(charSequence);
        jjVar.f27698c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new jj(context, d6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
