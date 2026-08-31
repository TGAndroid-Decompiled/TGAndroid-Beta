package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l81 extends org.telegram.ui.Components.i51 {
    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    public static org.telegram.ui.Components.j51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(l81.class);
        J.d = i10;
        J.f28013k = i13;
        J.f28014l = charSequence;
        J.f28015m = charSequence2;
        J.f28016n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        int i10;
        float f10;
        long j10 = j51Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        m81 m81Var = (m81) view;
        int i13 = j51Var.f28013k;
        CharSequence charSequence = j51Var.f28014l;
        CharSequence charSequence2 = j51Var.f28015m;
        CharSequence charSequence3 = j51Var.f28016n;
        TextView textView = m81Var.f39000e;
        TextView textView2 = m81Var.f39001f;
        FrameLayout frameLayout = m81Var.f38999c;
        int i14 = 8;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        float f11 = 0.0f;
        if (i13 == 0) {
            f10 = AndroidUtilities.dp(2.0f);
        } else {
            f10 = 0.0f;
        }
        textView.setTranslationX(f10);
        if (i13 == 0) {
            f11 = AndroidUtilities.dp(2.0f);
        }
        textView2.setTranslationX(f11);
        m81Var.f38998b.b(i11, i12);
        m81Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        m81Var.f39002n = !isEmpty;
        if (!isEmpty) {
            i14 = 0;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        m81Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new m81(context, g6Var);
    }
}
