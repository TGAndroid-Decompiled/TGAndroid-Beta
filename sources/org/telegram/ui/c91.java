package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class c91 extends org.telegram.ui.Components.h51 {
    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    public static org.telegram.ui.Components.i51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(c91.class);
        J.f24894l = str;
        J.f24895m = charSequence;
        J.f24896n = str2;
        J.D = onClickListener;
        J.f24897o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        d91 d91Var = (d91) view;
        CharSequence charSequence = i51Var.f24894l;
        CharSequence charSequence2 = i51Var.f24895m;
        CharSequence charSequence3 = i51Var.f24896n;
        View.OnClickListener onClickListener = i51Var.D;
        CharSequence charSequence4 = i51Var.f24897o;
        View.OnClickListener onClickListener2 = i51Var.E;
        ci.d dVar = d91Var.e;
        org.telegram.ui.Components.c90 c90Var = d91Var.f32967b;
        int i10 = 0;
        c90Var.setText(Emoji.replaceEmoji(charSequence, c90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.c90 c90Var2 = d91Var.f32968c;
        c90Var2.setText(Emoji.replaceEmoji(charSequence2, c90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = d91Var.d;
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
        return new d91(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
