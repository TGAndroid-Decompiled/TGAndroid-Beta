package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class k31 extends org.telegram.ui.Components.w31 {
    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    public static org.telegram.ui.Components.x31 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(k31.class);
        K.f40180l = str;
        K.f40181m = charSequence;
        K.f40182n = str2;
        K.D = onClickListener;
        K.f40183o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        l31 l31Var = (l31) view;
        CharSequence charSequence = x31Var.f40180l;
        CharSequence charSequence2 = x31Var.f40181m;
        CharSequence charSequence3 = x31Var.f40182n;
        View.OnClickListener onClickListener = x31Var.D;
        CharSequence charSequence4 = x31Var.f40183o;
        View.OnClickListener onClickListener2 = x31Var.E;
        fi.d dVar = l31Var.f47408e;
        org.telegram.ui.Components.w70 w70Var = l31Var.f47406b;
        int i7 = 0;
        w70Var.setText(org.telegram.messenger.i6.m(charSequence, w70Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.w70 w70Var2 = l31Var.f47407c;
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
