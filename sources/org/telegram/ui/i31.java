package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class i31 extends org.telegram.ui.Components.a41 {
    static {
        org.telegram.ui.Components.a41.h(new org.telegram.ui.Components.a41());
    }

    public static org.telegram.ui.Components.b41 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(i31.class);
        K.f33181l = str;
        K.f33182m = charSequence;
        K.f33183n = str2;
        K.D = onClickListener;
        K.f33184o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        j31 j31Var = (j31) view;
        CharSequence charSequence = b41Var.f33181l;
        CharSequence charSequence2 = b41Var.f33182m;
        CharSequence charSequence3 = b41Var.f33183n;
        View.OnClickListener onClickListener = b41Var.D;
        CharSequence charSequence4 = b41Var.f33184o;
        View.OnClickListener onClickListener2 = b41Var.E;
        hi.d dVar = j31Var.f48209e;
        org.telegram.ui.Components.z70 z70Var = j31Var.f48207b;
        int i7 = 0;
        z70Var.setText(org.telegram.messenger.j6.m(charSequence, z70Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.z70 z70Var2 = j31Var.f48208c;
        z70Var2.setText(org.telegram.messenger.j6.m(charSequence2, z70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        hi.d dVar2 = j31Var.d;
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
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new j31(context, e6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
