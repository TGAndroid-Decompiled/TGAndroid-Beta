package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class e91 extends org.telegram.ui.Components.v51 {
    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    public static org.telegram.ui.Components.w51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.w51 J = org.telegram.ui.Components.w51.J(e91.class);
        J.d = i10;
        J.f29947k = i13;
        J.f29948l = charSequence;
        J.f29949m = charSequence2;
        J.f29950n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        int i10;
        float f7;
        long j3 = w51Var.B;
        int i11 = (int) j3;
        int i12 = (int) (j3 >>> 32);
        f91 f91Var = (f91) view;
        int i13 = w51Var.f29947k;
        CharSequence charSequence = w51Var.f29948l;
        CharSequence charSequence2 = w51Var.f29949m;
        CharSequence charSequence3 = w51Var.f29950n;
        TextView textView = f91Var.e;
        TextView textView2 = f91Var.f33555f;
        FrameLayout frameLayout = f91Var.f33554c;
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
        f91Var.f33553b.b(i11, i12);
        f91Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        f91Var.f33556n = !isEmpty;
        if (!isEmpty) {
            i14 = 0;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        f91Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f91(context, f6Var);
    }
}
