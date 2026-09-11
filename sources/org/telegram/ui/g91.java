package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class g91 extends org.telegram.ui.Components.g51 {
    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    public static org.telegram.ui.Components.h51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(g91.class);
        J.f26594l = str;
        J.f26595m = charSequence;
        J.f26596n = str2;
        J.D = onClickListener;
        J.f26597o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        h91 h91Var = (h91) view;
        CharSequence charSequence = h51Var.f26594l;
        CharSequence charSequence2 = h51Var.f26595m;
        CharSequence charSequence3 = h51Var.f26596n;
        View.OnClickListener onClickListener = h51Var.D;
        CharSequence charSequence4 = h51Var.f26597o;
        View.OnClickListener onClickListener2 = h51Var.E;
        di.d dVar = h91Var.f36938e;
        org.telegram.ui.Components.d90 d90Var = h91Var.f36936b;
        int i10 = 0;
        d90Var.setText(Emoji.replaceEmoji(charSequence, d90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.d90 d90Var2 = h91Var.f36937c;
        d90Var2.setText(Emoji.replaceEmoji(charSequence2, d90Var2.getPaint().getFontMetricsInt(), false));
        di.d dVar2 = h91Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h91(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
