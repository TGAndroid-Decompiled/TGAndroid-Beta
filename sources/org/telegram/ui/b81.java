package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;
public final class b81 extends org.telegram.ui.Components.s61 {
    static {
        org.telegram.ui.Components.s61.setup(new org.telegram.ui.Components.s61());
    }

    public static org.telegram.ui.Components.t61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(b81.class);
        K.f32875l = str;
        K.f32876m = charSequence;
        K.f32877n = str2;
        K.D = onClickListener;
        K.f32878o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        c81 c81Var = (c81) view;
        CharSequence charSequence = t61Var.f32875l;
        CharSequence charSequence2 = t61Var.f32876m;
        CharSequence charSequence3 = t61Var.f32877n;
        View.OnClickListener onClickListener = t61Var.D;
        CharSequence charSequence4 = t61Var.f32878o;
        View.OnClickListener onClickListener2 = t61Var.E;
        fi.d dVar = c81Var.e;
        org.telegram.ui.Components.z90 z90Var = c81Var.f38373b;
        int i10 = 0;
        z90Var.setText(Emoji.replaceEmoji(charSequence, z90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.z90 z90Var2 = c81Var.f38374c;
        z90Var2.setText(Emoji.replaceEmoji(charSequence2, z90Var2.getPaint().getFontMetricsInt(), false));
        fi.d dVar2 = c81Var.d;
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
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new c81(context, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
