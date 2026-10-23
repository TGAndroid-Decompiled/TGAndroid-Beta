package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class a81 extends org.telegram.ui.Components.l61 {
    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    public static org.telegram.ui.Components.m61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(a81.class);
        J.f28559l = str;
        J.f28560m = charSequence;
        J.f28561n = str2;
        J.D = onClickListener;
        J.f28562o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        b81 b81Var = (b81) view;
        CharSequence charSequence = m61Var.f28559l;
        CharSequence charSequence2 = m61Var.f28560m;
        CharSequence charSequence3 = m61Var.f28561n;
        View.OnClickListener onClickListener = m61Var.D;
        CharSequence charSequence4 = m61Var.f28562o;
        View.OnClickListener onClickListener2 = m61Var.E;
        ei.d dVar = b81Var.e;
        org.telegram.ui.Components.y90 y90Var = b81Var.f35964b;
        int i10 = 0;
        y90Var.setText(Emoji.replaceEmoji(charSequence, y90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.y90 y90Var2 = b81Var.f35965c;
        y90Var2.setText(Emoji.replaceEmoji(charSequence2, y90Var2.getPaint().getFontMetricsInt(), false));
        ei.d dVar2 = b81Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new b81(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
