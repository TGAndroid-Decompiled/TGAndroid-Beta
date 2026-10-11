package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ij extends p61 {
    public static final int f27456a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        jj jjVar = (jj) view;
        CharSequence charSequence = q61Var.f30167l;
        CharSequence charSequence2 = q61Var.f30168m;
        jjVar.f27765b.setText(charSequence);
        jjVar.f27766c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new jj(context, d6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
