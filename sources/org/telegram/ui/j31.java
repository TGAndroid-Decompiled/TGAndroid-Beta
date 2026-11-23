package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class j31 extends org.telegram.ui.Components.m41 {
    static {
        org.telegram.ui.Components.m41.h(new org.telegram.ui.Components.m41());
    }

    public static org.telegram.ui.Components.n41 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(j31.class);
        K.d = i7;
        K.f37653k = i12;
        K.f37655m = charSequence;
        K.f37656n = charSequence2;
        K.f37657o = charSequence3;
        K.C = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        boolean z11;
        int i7;
        float f10;
        long j3 = n41Var.C;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        k31 k31Var = (k31) view;
        int i12 = n41Var.f37653k;
        CharSequence charSequence = n41Var.f37655m;
        CharSequence charSequence2 = n41Var.f37656n;
        CharSequence charSequence3 = n41Var.f37657o;
        TextView textView = k31Var.f49308e;
        TextView textView2 = k31Var.f49309f;
        int i13 = 0;
        if (i10 == 0 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        k31Var.f49310n = z11;
        FrameLayout frameLayout = k31Var.f49307c;
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
        k31Var.f49306b.b(i10, i11);
        k31Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        k31Var.f49311r = !isEmpty;
        if (isEmpty) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        textView2.setText(charSequence2);
        k31Var.setValue(charSequence3);
        k31Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new k31(context, i6Var);
    }
}
