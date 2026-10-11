package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class f91 extends org.telegram.ui.Components.q61 {
    static {
        org.telegram.ui.Components.q61.setup(new org.telegram.ui.Components.q61());
    }

    public static org.telegram.ui.Components.r61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.r61 J = org.telegram.ui.Components.r61.J(f91.class);
        J.f30361l = str;
        J.f30362m = charSequence;
        J.f30363n = str2;
        J.D = onClickListener;
        J.f30364o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.r61 r61Var, boolean z10, org.telegram.ui.Components.e71 e71Var, org.telegram.ui.Components.m71 m71Var) {
        g91 g91Var = (g91) view;
        CharSequence charSequence = r61Var.f30361l;
        CharSequence charSequence2 = r61Var.f30362m;
        CharSequence charSequence3 = r61Var.f30363n;
        View.OnClickListener onClickListener = r61Var.D;
        CharSequence charSequence4 = r61Var.f30364o;
        View.OnClickListener onClickListener2 = r61Var.E;
        ci.d dVar = g91Var.f37997e;
        org.telegram.ui.Components.fa0 fa0Var = g91Var.f37995b;
        int i10 = 0;
        fa0Var.setText(Emoji.replaceEmoji(charSequence, fa0Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.fa0 fa0Var2 = g91Var.f37996c;
        fa0Var2.setText(Emoji.replaceEmoji(charSequence2, fa0Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = g91Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new g91(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
