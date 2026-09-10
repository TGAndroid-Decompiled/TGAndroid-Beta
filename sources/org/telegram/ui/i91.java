package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class i91 extends org.telegram.ui.Components.u51 {
    static {
        org.telegram.ui.Components.u51.setup(new org.telegram.ui.Components.u51());
    }

    public static org.telegram.ui.Components.v51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(i91.class);
        J.f27829l = str;
        J.f27830m = charSequence;
        J.f27831n = str2;
        J.D = onClickListener;
        J.f27832o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        j91 j91Var = (j91) view;
        CharSequence charSequence = v51Var.f27829l;
        CharSequence charSequence2 = v51Var.f27830m;
        CharSequence charSequence3 = v51Var.f27831n;
        View.OnClickListener onClickListener = v51Var.D;
        CharSequence charSequence4 = v51Var.f27832o;
        View.OnClickListener onClickListener2 = v51Var.E;
        bi.d dVar = j91Var.e;
        org.telegram.ui.Components.m90 m90Var = j91Var.f34061b;
        int i10 = 0;
        m90Var.setText(Emoji.replaceEmoji(charSequence, m90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.m90 m90Var2 = j91Var.f34062c;
        m90Var2.setText(Emoji.replaceEmoji(charSequence2, m90Var2.getPaint().getFontMetricsInt(), false));
        bi.d dVar2 = j91Var.d;
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
        return new j91(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
