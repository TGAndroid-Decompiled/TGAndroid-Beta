package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class a31 extends org.telegram.ui.Components.q31 {
    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    public static org.telegram.ui.Components.r31 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(a31.class);
        K.f37627l = str;
        K.f37628m = charSequence;
        K.f37629n = str2;
        K.D = onClickListener;
        K.f37630o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        b31 b31Var = (b31) view;
        CharSequence charSequence = r31Var.f37627l;
        CharSequence charSequence2 = r31Var.f37628m;
        CharSequence charSequence3 = r31Var.f37629n;
        View.OnClickListener onClickListener = r31Var.D;
        CharSequence charSequence4 = r31Var.f37630o;
        View.OnClickListener onClickListener2 = r31Var.E;
        gi.d dVar = b31Var.f43912e;
        org.telegram.ui.Components.s70 s70Var = b31Var.f43910b;
        int i3 = 0;
        s70Var.setText(org.telegram.messenger.i6.m(charSequence, s70Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.s70 s70Var2 = b31Var.f43911c;
        s70Var2.setText(org.telegram.messenger.i6.m(charSequence2, s70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        gi.d dVar2 = b31Var.d;
        if (TextUtils.isEmpty(charSequence3)) {
            i3 = 8;
        }
        dVar2.setVisibility(i3);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new b31(context, e6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
