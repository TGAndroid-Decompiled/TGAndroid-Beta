package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class g91 extends org.telegram.ui.Components.p61 {
    static {
        org.telegram.ui.Components.p61.setup(new org.telegram.ui.Components.p61());
    }

    public static org.telegram.ui.Components.q61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.q61 J = org.telegram.ui.Components.q61.J(g91.class);
        J.f30063l = str;
        J.f30064m = charSequence;
        J.f30065n = str2;
        J.D = onClickListener;
        J.f30066o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.q61 q61Var, boolean z10, org.telegram.ui.Components.d71 d71Var, org.telegram.ui.Components.l71 l71Var) {
        h91 h91Var = (h91) view;
        CharSequence charSequence = q61Var.f30063l;
        CharSequence charSequence2 = q61Var.f30064m;
        CharSequence charSequence3 = q61Var.f30065n;
        View.OnClickListener onClickListener = q61Var.D;
        CharSequence charSequence4 = q61Var.f30066o;
        View.OnClickListener onClickListener2 = q61Var.E;
        ci.d dVar = h91Var.f38283e;
        org.telegram.ui.Components.fa0 fa0Var = h91Var.f38281b;
        int i10 = 0;
        fa0Var.setText(Emoji.replaceEmoji(charSequence, fa0Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.fa0 fa0Var2 = h91Var.f38282c;
        fa0Var2.setText(Emoji.replaceEmoji(charSequence2, fa0Var2.getPaint().getFontMetricsInt(), false));
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
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h91(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
