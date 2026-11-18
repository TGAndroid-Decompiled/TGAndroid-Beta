package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class k31 extends org.telegram.ui.Components.k41 {
    static {
        org.telegram.ui.Components.k41.h(new org.telegram.ui.Components.k41());
    }

    public static org.telegram.ui.Components.l41 i(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.l41 K = org.telegram.ui.Components.l41.K(k31.class);
        K.d = i7;
        K.f37016k = i12;
        K.f37018m = charSequence;
        K.f37019n = charSequence2;
        K.f37020o = charSequence3;
        K.C = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        boolean z11;
        int i7;
        float f10;
        long j3 = l41Var.C;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        l31 l31Var = (l31) view;
        int i12 = l41Var.f37016k;
        CharSequence charSequence = l41Var.f37018m;
        CharSequence charSequence2 = l41Var.f37019n;
        CharSequence charSequence3 = l41Var.f37020o;
        TextView textView = l31Var.f49427e;
        TextView textView2 = l31Var.f49428f;
        int i13 = 0;
        if (i10 == 0 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        l31Var.f49429n = z11;
        FrameLayout frameLayout = l31Var.f49426c;
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
        l31Var.f49425b.b(i10, i11);
        l31Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        l31Var.f49430r = !isEmpty;
        if (isEmpty) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        textView2.setText(charSequence2);
        l31Var.setValue(charSequence3);
        l31Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new l31(context, i6Var);
    }
}
