package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ij extends o61 {
    public static final int f27409a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        jj jjVar = (jj) view;
        CharSequence charSequence = p61Var.f29734l;
        CharSequence charSequence2 = p61Var.f29735m;
        jjVar.f27721b.setText(charSequence);
        jjVar.f27722c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new jj(context, e6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
