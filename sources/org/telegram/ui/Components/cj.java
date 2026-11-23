package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class cj extends n41 {
    static {
        n41.h(new n41());
    }

    public static o41 i(CharSequence charSequence, String str) {
        o41 K = o41.K(cj.class);
        K.f38091m = str;
        K.f38092n = charSequence;
        return K;
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        dj djVar = (dj) view;
        CharSequence charSequence = o41Var.f38091m;
        CharSequence charSequence2 = o41Var.f38092n;
        djVar.f34510b.setText(charSequence);
        djVar.f34511c.setText(charSequence2);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new dj(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
