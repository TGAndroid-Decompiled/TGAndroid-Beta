package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class m31 extends org.telegram.ui.Components.n41 {
    static {
        org.telegram.ui.Components.n41.h(new org.telegram.ui.Components.n41());
    }

    public static org.telegram.ui.Components.o41 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.o41 K = org.telegram.ui.Components.o41.K(m31.class);
        K.f38058m = str;
        K.f38059n = charSequence;
        K.f38060o = str2;
        K.E = onClickListener;
        K.f38061p = charSequence2;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        n31 n31Var = (n31) view;
        CharSequence charSequence = o41Var.f38058m;
        CharSequence charSequence2 = o41Var.f38059n;
        CharSequence charSequence3 = o41Var.f38060o;
        View.OnClickListener onClickListener = o41Var.E;
        CharSequence charSequence4 = o41Var.f38061p;
        View.OnClickListener onClickListener2 = o41Var.F;
        hi.d dVar = n31Var.f50071e;
        org.telegram.ui.Components.m80 m80Var = n31Var.f50069b;
        int i7 = 0;
        m80Var.setText(org.telegram.messenger.j6.m(charSequence, m80Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.m80 m80Var2 = n31Var.f50070c;
        m80Var2.setText(org.telegram.messenger.j6.m(charSequence2, m80Var2.getPaint().getFontMetricsInt(), false, null, 0));
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
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new n31(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
