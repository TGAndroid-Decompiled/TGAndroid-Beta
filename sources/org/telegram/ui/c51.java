package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class c51 extends org.telegram.ui.Components.z41 {
    static {
        org.telegram.ui.Components.z41.h(new org.telegram.ui.Components.z41());
    }

    public static org.telegram.ui.Components.a51 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(c51.class);
        K.f24292l = str;
        K.f24293m = charSequence;
        K.f24294n = str2;
        K.D = onClickListener;
        K.f24295o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        d51 d51Var = (d51) view;
        CharSequence charSequence = a51Var.f24292l;
        CharSequence charSequence2 = a51Var.f24293m;
        CharSequence charSequence3 = a51Var.f24294n;
        View.OnClickListener onClickListener = a51Var.D;
        CharSequence charSequence4 = a51Var.f24295o;
        View.OnClickListener onClickListener2 = a51Var.E;
        vh.d dVar = d51Var.e;
        org.telegram.ui.Components.p80 p80Var = d51Var.f36620b;
        int i10 = 0;
        p80Var.setText(org.telegram.messenger.k6.m(charSequence, p80Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.p80 p80Var2 = d51Var.f36621c;
        p80Var2.setText(org.telegram.messenger.k6.m(charSequence2, p80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        vh.d dVar2 = d51Var.d;
        if (TextUtils.isEmpty(charSequence3)) {
            i10 = 8;
        }
        dVar2.setVisibility(i10);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new d51(context, p6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
