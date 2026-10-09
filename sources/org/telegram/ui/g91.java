package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class g91 extends org.telegram.ui.Components.o61 {
    static {
        org.telegram.ui.Components.o61.setup(new org.telegram.ui.Components.o61());
    }

    public static org.telegram.ui.Components.p61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.p61 J = org.telegram.ui.Components.p61.J(g91.class);
        J.f29734l = str;
        J.f29735m = charSequence;
        J.f29736n = str2;
        J.D = onClickListener;
        J.f29737o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        h91 h91Var = (h91) view;
        CharSequence charSequence = p61Var.f29734l;
        CharSequence charSequence2 = p61Var.f29735m;
        CharSequence charSequence3 = p61Var.f29736n;
        View.OnClickListener onClickListener = p61Var.D;
        CharSequence charSequence4 = p61Var.f29737o;
        View.OnClickListener onClickListener2 = p61Var.E;
        ci.d dVar = h91Var.f38239e;
        org.telegram.ui.Components.ea0 ea0Var = h91Var.f38237b;
        int i10 = 0;
        ea0Var.setText(Emoji.replaceEmoji(charSequence, ea0Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.ea0 ea0Var2 = h91Var.f38238c;
        ea0Var2.setText(Emoji.replaceEmoji(charSequence2, ea0Var2.getPaint().getFontMetricsInt(), false));
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
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h91(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
