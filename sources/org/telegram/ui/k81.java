package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class k81 extends org.telegram.ui.Components.h51 {
    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    public static org.telegram.ui.Components.i51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(k81.class);
        J.d = i10;
        J.f25564k = i13;
        J.f25565l = charSequence;
        J.f25566m = charSequence2;
        J.f25567n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        int i10;
        float f10;
        long j10 = i51Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        l81 l81Var = (l81) view;
        int i13 = i51Var.f25564k;
        CharSequence charSequence = i51Var.f25565l;
        CharSequence charSequence2 = i51Var.f25566m;
        CharSequence charSequence3 = i51Var.f25567n;
        TextView textView = l81Var.e;
        TextView textView2 = l81Var.f35985f;
        FrameLayout frameLayout = l81Var.f35984c;
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
        l81Var.f35983b.b(i11, i12);
        l81Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        l81Var.f35986n = !isEmpty;
        if (!isEmpty) {
            i14 = 0;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        l81Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new l81(context, f6Var);
    }
}
