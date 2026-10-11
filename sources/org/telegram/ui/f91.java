package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class f91 extends org.telegram.ui.Components.p61 {
    static {
        org.telegram.ui.Components.p61.setup(new org.telegram.ui.Components.p61());
    }

    public static org.telegram.ui.Components.q61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.q61 J = org.telegram.ui.Components.q61.J(f91.class);
        J.f30167l = str;
        J.f30168m = charSequence;
        J.f30169n = str2;
        J.D = onClickListener;
        J.f30170o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.q61 q61Var, boolean z10, org.telegram.ui.Components.d71 d71Var, org.telegram.ui.Components.l71 l71Var) {
        g91 g91Var = (g91) view;
        CharSequence charSequence = q61Var.f30167l;
        CharSequence charSequence2 = q61Var.f30168m;
        CharSequence charSequence3 = q61Var.f30169n;
        View.OnClickListener onClickListener = q61Var.D;
        CharSequence charSequence4 = q61Var.f30170o;
        View.OnClickListener onClickListener2 = q61Var.E;
        ci.d dVar = g91Var.f38031e;
        org.telegram.ui.Components.ea0 ea0Var = g91Var.f38029b;
        int i10 = 0;
        ea0Var.setText(Emoji.replaceEmoji(charSequence, ea0Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.ea0 ea0Var2 = g91Var.f38030c;
        ea0Var2.setText(Emoji.replaceEmoji(charSequence2, ea0Var2.getPaint().getFontMetricsInt(), false));
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
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new g91(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
