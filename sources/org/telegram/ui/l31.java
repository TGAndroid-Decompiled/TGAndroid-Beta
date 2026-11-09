package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class l31 extends org.telegram.ui.Components.x31 {
    static {
        org.telegram.ui.Components.x31.h(new org.telegram.ui.Components.x31());
    }

    public static org.telegram.ui.Components.y31 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.y31 K = org.telegram.ui.Components.y31.K(l31.class);
        K.f40568l = str;
        K.f40569m = charSequence;
        K.f40570n = str2;
        K.D = onClickListener;
        K.f40571o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        m31 m31Var = (m31) view;
        CharSequence charSequence = y31Var.f40568l;
        CharSequence charSequence2 = y31Var.f40569m;
        CharSequence charSequence3 = y31Var.f40570n;
        View.OnClickListener onClickListener = y31Var.D;
        CharSequence charSequence4 = y31Var.f40571o;
        View.OnClickListener onClickListener2 = y31Var.E;
        fi.d dVar = m31Var.f47738e;
        org.telegram.ui.Components.x70 x70Var = m31Var.f47736b;
        int i7 = 0;
        x70Var.setText(org.telegram.messenger.i6.m(charSequence, x70Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.x70 x70Var2 = m31Var.f47737c;
        x70Var2.setText(org.telegram.messenger.i6.m(charSequence2, x70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        fi.d dVar2 = m31Var.d;
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
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new m31(context, g6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
