package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class i31 extends org.telegram.ui.Components.v31 {
    static {
        org.telegram.ui.Components.v31.h(new org.telegram.ui.Components.v31());
    }

    public static org.telegram.ui.Components.w31 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.w31 K = org.telegram.ui.Components.w31.K(i31.class);
        K.d = i7;
        K.f39829k = i12;
        K.f39830l = charSequence;
        K.f39831m = charSequence2;
        K.f39832n = charSequence3;
        K.B = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.w31 w31Var, boolean z9, org.telegram.ui.Components.k41 k41Var, org.telegram.ui.Components.p41 p41Var) {
        boolean z10;
        int i7;
        float f10;
        long j3 = w31Var.B;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        j31 j31Var = (j31) view;
        int i12 = w31Var.f39829k;
        CharSequence charSequence = w31Var.f39830l;
        CharSequence charSequence2 = w31Var.f39831m;
        CharSequence charSequence3 = w31Var.f39832n;
        TextView textView = j31Var.f46827e;
        TextView textView2 = j31Var.f46828f;
        int i13 = 0;
        if (i10 == 0 && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        j31Var.f46829n = z10;
        FrameLayout frameLayout = j31Var.f46826c;
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
        j31Var.f46825b.b(i10, i11);
        j31Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        j31Var.f46830r = !isEmpty;
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
