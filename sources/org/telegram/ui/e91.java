package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class e91 extends org.telegram.ui.Components.i51 {
    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    public static org.telegram.ui.Components.j51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(e91.class);
        J.f25124l = str;
        J.f25125m = charSequence;
        J.f25126n = str2;
        J.D = onClickListener;
        J.f25127o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        f91 f91Var = (f91) view;
        CharSequence charSequence = j51Var.f25124l;
        CharSequence charSequence2 = j51Var.f25125m;
        CharSequence charSequence3 = j51Var.f25126n;
        View.OnClickListener onClickListener = j51Var.D;
        CharSequence charSequence4 = j51Var.f25127o;
        View.OnClickListener onClickListener2 = j51Var.E;
        ci.d dVar = f91Var.e;
        org.telegram.ui.Components.c90 c90Var = f91Var.f33591b;
        int i10 = 0;
        c90Var.setText(Emoji.replaceEmoji(charSequence, c90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.c90 c90Var2 = f91Var.f33592c;
        c90Var2.setText(Emoji.replaceEmoji(charSequence2, c90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = f91Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f91(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
