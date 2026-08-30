package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class m81 extends org.telegram.ui.Components.h51 {
    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    public static org.telegram.ui.Components.i51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(m81.class);
        J.f25565l = str;
        J.f25566m = charSequence;
        J.f25567n = str2;
        J.D = onClickListener;
        J.f25568o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        n81 n81Var = (n81) view;
        CharSequence charSequence = i51Var.f25565l;
        CharSequence charSequence2 = i51Var.f25566m;
        CharSequence charSequence3 = i51Var.f25567n;
        View.OnClickListener onClickListener = i51Var.D;
        CharSequence charSequence4 = i51Var.f25568o;
        View.OnClickListener onClickListener2 = i51Var.E;
        ph.d dVar = n81Var.e;
        org.telegram.ui.Components.e90 e90Var = n81Var.f36520b;
        int i10 = 0;
        e90Var.setText(Emoji.replaceEmoji(charSequence, e90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.e90 e90Var2 = n81Var.f36521c;
        e90Var2.setText(Emoji.replaceEmoji(charSequence2, e90Var2.getPaint().getFontMetricsInt(), false));
        ph.d dVar2 = n81Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new n81(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
