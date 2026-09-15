package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a91 extends org.telegram.ui.Components.h51 {
    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    public static org.telegram.ui.Components.i51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(a91.class);
        J.d = i10;
        J.f24893k = i13;
        J.f24894l = charSequence;
        J.f24895m = charSequence2;
        J.f24896n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        int i10;
        float f7;
        long j3 = i51Var.B;
        int i11 = (int) j3;
        int i12 = (int) (j3 >>> 32);
        b91 b91Var = (b91) view;
        int i13 = i51Var.f24893k;
        CharSequence charSequence = i51Var.f24894l;
        CharSequence charSequence2 = i51Var.f24895m;
        CharSequence charSequence3 = i51Var.f24896n;
        TextView textView = b91Var.e;
        TextView textView2 = b91Var.f32107f;
        FrameLayout frameLayout = b91Var.f32106c;
        int i14 = 8;
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
        b91Var.f32105b.b(i11, i12);
        b91Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        b91Var.f32108n = !isEmpty;
        if (!isEmpty) {
            i14 = 0;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        b91Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new b91(context, e6Var);
    }
}
