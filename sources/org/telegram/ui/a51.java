package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class a51 extends org.telegram.ui.Components.a51 {
    static {
        org.telegram.ui.Components.a51.h(new org.telegram.ui.Components.a51());
    }

    public static org.telegram.ui.Components.b51 i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.b51 K = org.telegram.ui.Components.b51.K(a51.class);
        K.f24643l = str;
        K.f24644m = charSequence;
        K.f24645n = str2;
        K.D = onClickListener;
        K.f24646o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        b51 b51Var2 = (b51) view;
        CharSequence charSequence = b51Var.f24643l;
        CharSequence charSequence2 = b51Var.f24644m;
        CharSequence charSequence3 = b51Var.f24645n;
        View.OnClickListener onClickListener = b51Var.D;
        CharSequence charSequence4 = b51Var.f24646o;
        View.OnClickListener onClickListener2 = b51Var.E;
        vh.d dVar = b51Var2.e;
        org.telegram.ui.Components.p80 p80Var = b51Var2.f35949b;
        int i10 = 0;
        p80Var.setText(org.telegram.messenger.k6.m(charSequence, p80Var.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.Components.p80 p80Var2 = b51Var2.f35950c;
        p80Var2.setText(org.telegram.messenger.k6.m(charSequence2, p80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        vh.d dVar2 = b51Var2.d;
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
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new b51(context, p6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
