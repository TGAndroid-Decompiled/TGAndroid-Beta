package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class aj extends k41 {
    static {
        k41.h(new k41());
    }

    public static l41 i(CharSequence charSequence, String str) {
        l41 K = l41.K(aj.class);
        K.f37018m = str;
        K.f37019n = charSequence;
        return K;
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        bj bjVar = (bj) view;
        CharSequence charSequence = l41Var.f37018m;
        CharSequence charSequence2 = l41Var.f37019n;
        bjVar.f33700b.setText(charSequence);
        bjVar.f33701c.setText(charSequence2);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new bj(context, i6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
