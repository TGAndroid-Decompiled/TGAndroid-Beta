package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class g31 extends org.telegram.ui.Components.a41 {
    static {
        org.telegram.ui.Components.a41.h(new org.telegram.ui.Components.a41());
    }

    public static org.telegram.ui.Components.b41 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(g31.class);
        K.d = i7;
        K.f33180k = i12;
        K.f33181l = charSequence;
        K.f33182m = charSequence2;
        K.f33183n = charSequence3;
        K.B = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        boolean z11;
        int i7;
        float f10;
        long j3 = b41Var.B;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        h31 h31Var = (h31) view;
        int i12 = b41Var.f33180k;
        CharSequence charSequence = b41Var.f33181l;
        CharSequence charSequence2 = b41Var.f33182m;
        CharSequence charSequence3 = b41Var.f33183n;
        TextView textView = h31Var.f47602e;
        TextView textView2 = h31Var.f47603f;
        int i13 = 0;
        if (i10 == 0 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        h31Var.f47604n = z11;
        FrameLayout frameLayout = h31Var.f47601c;
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
        h31Var.f47600b.b(i10, i11);
        h31Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        h31Var.f47605r = !isEmpty;
        if (isEmpty) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        textView2.setText(charSequence2);
        h31Var.setValue(charSequence3);
        h31Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h31(context, e6Var);
    }
}
