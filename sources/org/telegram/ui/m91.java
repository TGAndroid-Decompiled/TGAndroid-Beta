package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class m91 extends org.telegram.ui.Components.l61 {
    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    public static org.telegram.ui.Components.m61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(m91.class);
        J.f26946l = str;
        J.f26947m = charSequence;
        J.f26948n = str2;
        J.D = onClickListener;
        J.f26949o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        n91 n91Var = (n91) view;
        CharSequence charSequence = m61Var.f26946l;
        CharSequence charSequence2 = m61Var.f26947m;
        CharSequence charSequence3 = m61Var.f26948n;
        View.OnClickListener onClickListener = m61Var.D;
        CharSequence charSequence4 = m61Var.f26949o;
        View.OnClickListener onClickListener2 = m61Var.E;
        di.d dVar = n91Var.e;
        org.telegram.ui.Components.da0 da0Var = n91Var.f38340b;
        int i10 = 0;
        da0Var.setText(Emoji.replaceEmoji(charSequence, da0Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.da0 da0Var2 = n91Var.f38341c;
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
