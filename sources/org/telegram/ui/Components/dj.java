package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dj extends s61 {
    public static final int f27529a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ej ejVar = (ej) view;
        CharSequence charSequence = t61Var.f32872l;
        CharSequence charSequence2 = t61Var.f32873m;
        ejVar.f27882b.setText(charSequence);
        ejVar.f27883c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new ej(context, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
