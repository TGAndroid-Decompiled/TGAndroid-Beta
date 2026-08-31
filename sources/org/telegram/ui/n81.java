package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class n81 extends org.telegram.ui.Components.i51 {
    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    public static org.telegram.ui.Components.j51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(n81.class);
        J.f28014l = str;
        J.f28015m = charSequence;
        J.f28016n = str2;
        J.D = onClickListener;
        J.f28017o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        o81 o81Var = (o81) view;
        CharSequence charSequence = j51Var.f28014l;
        CharSequence charSequence2 = j51Var.f28015m;
        CharSequence charSequence3 = j51Var.f28016n;
        View.OnClickListener onClickListener = j51Var.D;
        CharSequence charSequence4 = j51Var.f28017o;
        View.OnClickListener onClickListener2 = j51Var.E;
        qh.d dVar = o81Var.f39659e;
        org.telegram.ui.Components.g90 g90Var = o81Var.f39657b;
        int i10 = 0;
        g90Var.setText(Emoji.replaceEmoji(charSequence, g90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.g90 g90Var2 = o81Var.f39658c;
        g90Var2.setText(Emoji.replaceEmoji(charSequence2, g90Var2.getPaint().getFontMetricsInt(), false));
        qh.d dVar2 = o81Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new o81(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
