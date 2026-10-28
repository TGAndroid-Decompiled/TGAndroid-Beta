package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b81 extends org.telegram.ui.Components.t61 {
    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    public static org.telegram.ui.Components.u61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.u61 K = org.telegram.ui.Components.u61.K(b81.class);
        K.d = i10;
        K.f33248k = i13;
        K.f33249l = charSequence;
        K.f33250m = charSequence2;
        K.f33251n = charSequence3;
        K.B = (i11 & 4294967295L) | (i12 << 32);
        return K;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        boolean z11;
        int i10;
        float f7;
        long j10 = u61Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        c81 c81Var = (c81) view;
        int i13 = u61Var.f33248k;
        CharSequence charSequence = u61Var.f33249l;
        CharSequence charSequence2 = u61Var.f33250m;
        CharSequence charSequence3 = u61Var.f33251n;
        TextView textView = c81Var.e;
        TextView textView2 = c81Var.f38218f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        c81Var.f38219n = z11;
        FrameLayout frameLayout = c81Var.f38217c;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        float f10 = 0.0f;
        if (i13 == 0) {
            f7 = AndroidUtilities.dp(2.0f);
        } else {
            f7 = 0.0f;
        }
        textView.setTranslationX(f7);
        if (i13 == 0) {
            f10 = AndroidUtilities.dp(2.0f);
        }
        textView2.setTranslationX(f10);
        c81Var.f38216b.b(i11, i12);
        c81Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        c81Var.f38220r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        c81Var.setValue(charSequence3);
        c81Var.updateColors();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new c81(context, u6Var);
    }
}
