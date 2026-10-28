package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class d81 extends org.telegram.ui.Components.t61 {
    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    public static org.telegram.ui.Components.u61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.u61 K = org.telegram.ui.Components.u61.K(d81.class);
        K.f33249l = str;
        K.f33250m = charSequence;
        K.f33251n = str2;
        K.D = onClickListener;
        K.f33252o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        e81 e81Var = (e81) view;
        CharSequence charSequence = u61Var.f33249l;
        CharSequence charSequence2 = u61Var.f33250m;
        CharSequence charSequence3 = u61Var.f33251n;
        View.OnClickListener onClickListener = u61Var.D;
        CharSequence charSequence4 = u61Var.f33252o;
        View.OnClickListener onClickListener2 = u61Var.E;
        fi.d dVar = e81Var.e;
        org.telegram.ui.Components.aa0 aa0Var = e81Var.f38781b;
        int i10 = 0;
        aa0Var.setText(Emoji.replaceEmoji(charSequence, aa0Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.aa0 aa0Var2 = e81Var.f38782c;
        aa0Var2.setText(Emoji.replaceEmoji(charSequence2, aa0Var2.getPaint().getFontMetricsInt(), false));
        fi.d dVar2 = e81Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new e81(context, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
