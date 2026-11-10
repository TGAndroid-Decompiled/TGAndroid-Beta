package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class k31 extends org.telegram.ui.Components.w31 {
    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    public static org.telegram.ui.Components.x31 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(k31.class);
        K.d = i7;
        K.f40155k = i12;
        K.f40156l = charSequence;
        K.f40157m = charSequence2;
        K.f40158n = charSequence3;
        K.B = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        boolean z10;
        int i7;
        float f10;
        long j3 = x31Var.B;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        l31 l31Var = (l31) view;
        int i12 = x31Var.f40155k;
        CharSequence charSequence = x31Var.f40156l;
        CharSequence charSequence2 = x31Var.f40157m;
        CharSequence charSequence3 = x31Var.f40158n;
        TextView textView = l31Var.f47507e;
        TextView textView2 = l31Var.f47508f;
        int i13 = 0;
        if (i10 == 0 && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        l31Var.f47509n = z10;
        FrameLayout frameLayout = l31Var.f47506c;
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
        l31Var.f47505b.b(i10, i11);
        l31Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        l31Var.f47510r = !isEmpty;
        if (isEmpty) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        textView2.setText(charSequence2);
        l31Var.setValue(charSequence3);
        l31Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new l31(context, h6Var);
    }
}
