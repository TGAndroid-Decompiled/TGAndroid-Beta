package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class k31 extends org.telegram.ui.Components.v31 {
    static {
        org.telegram.ui.Components.v31.h(new org.telegram.ui.Components.v31());
    }

    public static org.telegram.ui.Components.w31 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.w31 K = org.telegram.ui.Components.w31.K(k31.class);
        K.f39830l = str;
        K.f39831m = charSequence;
        K.f39832n = str2;
        K.D = onClickListener;
        K.f39833o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.w31 w31Var, boolean z9, org.telegram.ui.Components.k41 k41Var, org.telegram.ui.Components.p41 p41Var) {
        l31 l31Var = (l31) view;
        CharSequence charSequence = w31Var.f39830l;
        CharSequence charSequence2 = w31Var.f39831m;
        CharSequence charSequence3 = w31Var.f39832n;
        View.OnClickListener onClickListener = w31Var.D;
        CharSequence charSequence4 = w31Var.f39833o;
        View.OnClickListener onClickListener2 = w31Var.E;
        fi.d dVar = l31Var.f47404e;
        org.telegram.ui.Components.w70 w70Var = l31Var.f47402b;
        int i7 = 0;
        w70Var.setText(org.telegram.messenger.i6.m(charSequence, w70Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.w70 w70Var2 = l31Var.f47403c;
        w70Var2.setText(org.telegram.messenger.i6.m(charSequence2, w70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        fi.d dVar2 = l31Var.d;
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
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new l31(context, f6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
