package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class l31 extends org.telegram.ui.Components.m41 {
    static {
        org.telegram.ui.Components.m41.h(new org.telegram.ui.Components.m41());
    }

    public static org.telegram.ui.Components.n41 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(l31.class);
        K.f37655m = str;
        K.f37656n = charSequence;
        K.f37657o = str2;
        K.E = onClickListener;
        K.f37658p = charSequence2;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        m31 m31Var = (m31) view;
        CharSequence charSequence = n41Var.f37655m;
        CharSequence charSequence2 = n41Var.f37656n;
        CharSequence charSequence3 = n41Var.f37657o;
        View.OnClickListener onClickListener = n41Var.E;
        CharSequence charSequence4 = n41Var.f37658p;
        View.OnClickListener onClickListener2 = n41Var.F;
        hi.e eVar = m31Var.f49948e;
        org.telegram.ui.Components.j80 j80Var = m31Var.f49946b;
        int i7 = 0;
        j80Var.setText(org.telegram.messenger.j6.m(charSequence, j80Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.j80 j80Var2 = m31Var.f49947c;
        j80Var2.setText(org.telegram.messenger.j6.m(charSequence2, j80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        hi.e eVar2 = m31Var.d;
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
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new m31(context, i6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
