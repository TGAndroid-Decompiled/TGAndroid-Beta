package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class a51 extends org.telegram.ui.Components.z41 {
    static {
        org.telegram.ui.Components.z41.h(new org.telegram.ui.Components.z41());
    }

    public static org.telegram.ui.Components.a51 i(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(a51.class);
        K.d = i10;
        K.f24291k = i13;
        K.f24292l = charSequence;
        K.f24293m = charSequence2;
        K.f24294n = charSequence3;
        K.B = (i11 & 4294967295L) | (i12 << 32);
        return K;
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        boolean z11;
        int i10;
        float f7;
        long j10 = a51Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        b51 b51Var = (b51) view;
        int i13 = a51Var.f24291k;
        CharSequence charSequence = a51Var.f24292l;
        CharSequence charSequence2 = a51Var.f24293m;
        CharSequence charSequence3 = a51Var.f24294n;
        TextView textView = b51Var.e;
        TextView textView2 = b51Var.f36109f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        b51Var.f36110n = z11;
        FrameLayout frameLayout = b51Var.f36108c;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        float f10 = 0.0f;
        if (i13 == 0) {
            f7 = org.telegram.messenger.i0.L(2.0f);
        } else {
            f7 = 0.0f;
        }
        textView.setTranslationX(f7);
        if (i13 == 0) {
            f10 = org.telegram.messenger.i0.L(2.0f);
        }
        textView2.setTranslationX(f10);
        b51Var.f36107b.b(i11, i12);
        b51Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        b51Var.f36111r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        b51Var.setValue(charSequence3);
        b51Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new b51(context, p6Var);
    }
}
