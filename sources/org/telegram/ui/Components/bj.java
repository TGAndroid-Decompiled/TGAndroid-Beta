package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class bj extends m41 {
    static {
        m41.h(new m41());
    }

    public static n41 i(CharSequence charSequence, String str) {
        n41 K = n41.K(bj.class);
        K.f37655m = str;
        K.f37656n = charSequence;
        return K;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        cj cjVar = (cj) view;
        CharSequence charSequence = n41Var.f37655m;
        CharSequence charSequence2 = n41Var.f37656n;
        cjVar.f34069b.setText(charSequence);
        cjVar.f34070c.setText(charSequence2);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new cj(context, i6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
