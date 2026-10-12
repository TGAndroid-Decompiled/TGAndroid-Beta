package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class g91 extends org.telegram.ui.Components.t61 {
    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    public static org.telegram.ui.Components.u61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.u61 J = org.telegram.ui.Components.u61.J(g91.class);
        J.d = i10;
        J.f31075k = i13;
        J.f31076l = charSequence;
        J.f31077m = charSequence2;
        J.f31078n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.h71 h71Var, org.telegram.ui.Components.p71 p71Var) {
        boolean z11;
        int i10;
        float f7;
        long j3 = u61Var.B;
        int i11 = (int) j3;
        int i12 = (int) (j3 >>> 32);
        h91 h91Var = (h91) view;
        int i13 = u61Var.f31075k;
        CharSequence charSequence = u61Var.f31076l;
        CharSequence charSequence2 = u61Var.f31077m;
        CharSequence charSequence3 = u61Var.f31078n;
        TextView textView = h91Var.f38305e;
        TextView textView2 = h91Var.f38306f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        h91Var.f38307n = z11;
        FrameLayout frameLayout = h91Var.f38304c;
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
        h91Var.f38303b.b(i11, i12);
        h91Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        h91Var.f38308r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        h91Var.setValue(charSequence3);
        h91Var.e();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new h91(context, c6Var);
    }
}
