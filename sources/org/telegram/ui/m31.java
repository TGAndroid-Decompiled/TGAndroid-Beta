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
        K.f38098m = str;
        K.f38099n = charSequence;
        K.f38100o = str2;
        K.E = onClickListener;
        K.f38101p = charSequence2;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        n31 n31Var = (n31) view;
        CharSequence charSequence = o41Var.f38098m;
        CharSequence charSequence2 = o41Var.f38099n;
        CharSequence charSequence3 = o41Var.f38100o;
        View.OnClickListener onClickListener = o41Var.E;
        CharSequence charSequence4 = o41Var.f38101p;
        View.OnClickListener onClickListener2 = o41Var.F;
        hi.e eVar = n31Var.f50081e;
        org.telegram.ui.Components.m80 m80Var = n31Var.f50079b;
        int i7 = 0;
        m80Var.setText(org.telegram.messenger.j6.m(charSequence, m80Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.m80 m80Var2 = n31Var.f50080c;
        m80Var2.setText(org.telegram.messenger.j6.m(charSequence2, m80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        hi.e eVar2 = n31Var.d;
        if (TextUtils.isEmpty(charSequence3)) {
            i7 = 8;
        }
        eVar2.setVisibility(i7);
        eVar2.setText(charSequence3);
        eVar2.setOnClickListener(onClickListener);
        eVar.setText(charSequence4);
        eVar.setOnClickListener(onClickListener2);
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
