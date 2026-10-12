package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class m91 extends org.telegram.ui.Components.k61 {
    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    public static org.telegram.ui.Components.l61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.l61 J = org.telegram.ui.Components.l61.J(m91.class);
        J.f26954l = str;
        J.f26955m = charSequence;
        J.f26956n = str2;
        J.D = onClickListener;
        J.f26957o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        n91 n91Var = (n91) view;
        CharSequence charSequence = l61Var.f26954l;
        CharSequence charSequence2 = l61Var.f26955m;
        CharSequence charSequence3 = l61Var.f26956n;
        View.OnClickListener onClickListener = l61Var.D;
        CharSequence charSequence4 = l61Var.f26957o;
        View.OnClickListener onClickListener2 = l61Var.E;
        di.d dVar = n91Var.e;
        org.telegram.ui.Components.da0 da0Var = n91Var.f38625b;
        int i10 = 0;
        da0Var.setText(Emoji.replaceEmoji(charSequence, da0Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.da0 da0Var2 = n91Var.f38626c;
        da0Var2.setText(Emoji.replaceEmoji(charSequence2, da0Var2.getPaint().getFontMetricsInt(), false));
        di.d dVar2 = n91Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new n91(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
