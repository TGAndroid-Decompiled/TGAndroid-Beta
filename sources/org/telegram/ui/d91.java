package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class d91 extends org.telegram.ui.Components.h51 {
    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    public static org.telegram.ui.Components.i51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(d91.class);
        J.f24900l = str;
        J.f24901m = charSequence;
        J.f24902n = str2;
        J.D = onClickListener;
        J.f24903o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        e91 e91Var = (e91) view;
        CharSequence charSequence = i51Var.f24900l;
        CharSequence charSequence2 = i51Var.f24901m;
        CharSequence charSequence3 = i51Var.f24902n;
        View.OnClickListener onClickListener = i51Var.D;
        CharSequence charSequence4 = i51Var.f24903o;
        View.OnClickListener onClickListener2 = i51Var.E;
        ci.d dVar = e91Var.e;
        org.telegram.ui.Components.c90 c90Var = e91Var.f33235b;
        int i10 = 0;
        c90Var.setText(Emoji.replaceEmoji(charSequence, c90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.c90 c90Var2 = e91Var.f33236c;
        c90Var2.setText(Emoji.replaceEmoji(charSequence2, c90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = e91Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new e91(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
