package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class m31 extends org.telegram.ui.Components.k41 {
    static {
        org.telegram.ui.Components.k41.h(new org.telegram.ui.Components.k41());
    }

    public static org.telegram.ui.Components.l41 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.l41 K = org.telegram.ui.Components.l41.K(m31.class);
        K.f37018m = str;
        K.f37019n = charSequence;
        K.f37020o = str2;
        K.E = onClickListener;
        K.f37021p = charSequence2;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        n31 n31Var = (n31) view;
        CharSequence charSequence = l41Var.f37018m;
        CharSequence charSequence2 = l41Var.f37019n;
        CharSequence charSequence3 = l41Var.f37020o;
        View.OnClickListener onClickListener = l41Var.E;
        CharSequence charSequence4 = l41Var.f37021p;
        View.OnClickListener onClickListener2 = l41Var.F;
        hi.d dVar = n31Var.f50052e;
        org.telegram.ui.Components.k80 k80Var = n31Var.f50050b;
        int i7 = 0;
        k80Var.setText(org.telegram.messenger.j6.m(charSequence, k80Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.k80 k80Var2 = n31Var.f50051c;
        k80Var2.setText(org.telegram.messenger.j6.m(charSequence2, k80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        hi.d dVar2 = n31Var.d;
        if (TextUtils.isEmpty(charSequence3)) {
            i7 = 8;
        }
        dVar2.setVisibility(i7);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new n31(context, i6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
