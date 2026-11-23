package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class k31 extends org.telegram.ui.Components.n41 {
    static {
        org.telegram.ui.Components.n41.h(new org.telegram.ui.Components.n41());
    }

    public static org.telegram.ui.Components.o41 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.o41 K = org.telegram.ui.Components.o41.K(k31.class);
        K.d = i7;
        K.f38089k = i12;
        K.f38091m = charSequence;
        K.f38092n = charSequence2;
        K.f38093o = charSequence3;
        K.C = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        boolean z11;
        int i7;
        float f10;
        long j3 = o41Var.C;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        l31 l31Var = (l31) view;
        int i12 = o41Var.f38089k;
        CharSequence charSequence = o41Var.f38091m;
        CharSequence charSequence2 = o41Var.f38092n;
        CharSequence charSequence3 = o41Var.f38093o;
        TextView textView = l31Var.f49469e;
        TextView textView2 = l31Var.f49470f;
        int i13 = 0;
        if (i10 == 0 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        l31Var.f49471n = z11;
        FrameLayout frameLayout = l31Var.f49468c;
        if (i12 != 0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        frameLayout.setVisibility(i7);
        float f11 = 0.0f;
        if (i12 == 0) {
            f10 = org.telegram.messenger.g0.L(2.0f);
        } else {
            f10 = 0.0f;
        }
        textView.setTranslationX(f10);
        if (i12 == 0) {
            f11 = org.telegram.messenger.g0.L(2.0f);
        }
        textView2.setTranslationX(f11);
        l31Var.f49467b.b(i10, i11);
        l31Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        l31Var.f49472r = !isEmpty;
        if (isEmpty) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        textView2.setText(charSequence2);
        l31Var.setValue(charSequence3);
        l31Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new l31(context, h6Var);
    }
}
