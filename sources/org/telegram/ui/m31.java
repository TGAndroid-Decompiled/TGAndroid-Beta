package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class m31 extends org.telegram.ui.Components.w31 {
    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    public static org.telegram.ui.Components.x31 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(m31.class);
        K.f40156l = str;
        K.f40157m = charSequence;
        K.f40158n = str2;
        K.D = onClickListener;
        K.f40159o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        n31 n31Var = (n31) view;
        CharSequence charSequence = x31Var.f40156l;
        CharSequence charSequence2 = x31Var.f40157m;
        CharSequence charSequence3 = x31Var.f40158n;
        View.OnClickListener onClickListener = x31Var.D;
        CharSequence charSequence4 = x31Var.f40159o;
        View.OnClickListener onClickListener2 = x31Var.E;
        fi.d dVar = n31Var.f48110e;
        org.telegram.ui.Components.w70 w70Var = n31Var.f48108b;
        int i7 = 0;
        w70Var.setText(org.telegram.messenger.i6.m(charSequence, w70Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.w70 w70Var2 = n31Var.f48109c;
        w70Var2.setText(org.telegram.messenger.i6.m(charSequence2, w70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        fi.d dVar2 = n31Var.d;
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
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new n31(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
