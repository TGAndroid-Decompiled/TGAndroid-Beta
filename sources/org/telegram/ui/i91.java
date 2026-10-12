package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class i91 extends org.telegram.ui.Components.t61 {
    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    public static org.telegram.ui.Components.u61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.u61 J = org.telegram.ui.Components.u61.J(i91.class);
        J.f31071l = str;
        J.f31072m = charSequence;
        J.f31073n = str2;
        J.D = onClickListener;
        J.f31074o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.h71 h71Var, org.telegram.ui.Components.p71 p71Var) {
        j91 j91Var = (j91) view;
        CharSequence charSequence = u61Var.f31071l;
        CharSequence charSequence2 = u61Var.f31072m;
        CharSequence charSequence3 = u61Var.f31073n;
        View.OnClickListener onClickListener = u61Var.D;
        CharSequence charSequence4 = u61Var.f31074o;
        View.OnClickListener onClickListener2 = u61Var.E;
        ci.d dVar = j91Var.f39166e;
        org.telegram.ui.Components.ia0 ia0Var = j91Var.f39164b;
        int i10 = 0;
        ia0Var.setText(Emoji.replaceEmoji(charSequence, ia0Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.ia0 ia0Var2 = j91Var.f39165c;
        ia0Var2.setText(Emoji.replaceEmoji(charSequence2, ia0Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = j91Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new j91(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
