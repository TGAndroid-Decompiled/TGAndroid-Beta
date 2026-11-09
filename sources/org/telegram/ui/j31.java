package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class j31 extends org.telegram.ui.Components.x31 {
    static {
        org.telegram.ui.Components.x31.h(new org.telegram.ui.Components.x31());
    }

    public static org.telegram.ui.Components.y31 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.y31 K = org.telegram.ui.Components.y31.K(j31.class);
        K.d = i7;
        K.f40567k = i12;
        K.f40568l = charSequence;
        K.f40569m = charSequence2;
        K.f40570n = charSequence3;
        K.B = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        boolean z10;
        int i7;
        float f10;
        long j3 = y31Var.B;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        k31 k31Var = (k31) view;
        int i12 = y31Var.f40567k;
        CharSequence charSequence = y31Var.f40568l;
        CharSequence charSequence2 = y31Var.f40569m;
        CharSequence charSequence3 = y31Var.f40570n;
        TextView textView = k31Var.f47187e;
        TextView textView2 = k31Var.f47188f;
        int i13 = 0;
        if (i10 == 0 && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        k31Var.f47189n = z10;
        FrameLayout frameLayout = k31Var.f47186c;
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
        k31Var.f47185b.b(i10, i11);
        k31Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        k31Var.f47190r = !isEmpty;
        if (isEmpty) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        textView2.setText(charSequence2);
        k31Var.setValue(charSequence3);
        k31Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new k31(context, g6Var);
    }
}
