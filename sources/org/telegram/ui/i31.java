package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class i31 extends org.telegram.ui.Components.w31 {
    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    public static org.telegram.ui.Components.x31 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(i31.class);
        K.d = i7;
        K.f40179k = i12;
        K.f40180l = charSequence;
        K.f40181m = charSequence2;
        K.f40182n = charSequence3;
        K.B = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        boolean z10;
        int i7;
        float f10;
        long j3 = x31Var.B;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        j31 j31Var = (j31) view;
        int i12 = x31Var.f40179k;
        CharSequence charSequence = x31Var.f40180l;
        CharSequence charSequence2 = x31Var.f40181m;
        CharSequence charSequence3 = x31Var.f40182n;
        TextView textView = j31Var.f46829e;
        TextView textView2 = j31Var.f46830f;
        int i13 = 0;
        if (i10 == 0 && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        j31Var.f46831n = z10;
        FrameLayout frameLayout = j31Var.f46828c;
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
        j31Var.f46827b.b(i10, i11);
        j31Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        j31Var.f46832r = !isEmpty;
        if (isEmpty) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        textView2.setText(charSequence2);
        j31Var.setValue(charSequence3);
        j31Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j31(context, f6Var);
    }
}
