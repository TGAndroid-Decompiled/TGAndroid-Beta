package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class g91 extends org.telegram.ui.Components.v51 {
    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    public static org.telegram.ui.Components.w51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.w51 J = org.telegram.ui.Components.w51.J(g91.class);
        J.f29948l = str;
        J.f29949m = charSequence;
        J.f29950n = str2;
        J.D = onClickListener;
        J.f29951o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        h91 h91Var = (h91) view;
        CharSequence charSequence = w51Var.f29948l;
        CharSequence charSequence2 = w51Var.f29949m;
        CharSequence charSequence3 = w51Var.f29950n;
        View.OnClickListener onClickListener = w51Var.D;
        CharSequence charSequence4 = w51Var.f29951o;
        View.OnClickListener onClickListener2 = w51Var.E;
        ci.d dVar = h91Var.e;
        org.telegram.ui.Components.k90 k90Var = h91Var.f34153b;
        int i10 = 0;
        k90Var.setText(Emoji.replaceEmoji(charSequence, k90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.k90 k90Var2 = h91Var.f34154c;
        k90Var2.setText(Emoji.replaceEmoji(charSequence2, k90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = h91Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h91(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
