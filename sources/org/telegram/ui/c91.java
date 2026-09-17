package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class c91 extends org.telegram.ui.Components.i51 {
    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    public static org.telegram.ui.Components.j51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(c91.class);
        J.d = i10;
        J.f25123k = i13;
        J.f25124l = charSequence;
        J.f25125m = charSequence2;
        J.f25126n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        int i10;
        float f7;
        long j3 = j51Var.B;
        int i11 = (int) j3;
        int i12 = (int) (j3 >>> 32);
        d91 d91Var = (d91) view;
        int i13 = j51Var.f25123k;
        CharSequence charSequence = j51Var.f25124l;
        CharSequence charSequence2 = j51Var.f25125m;
        CharSequence charSequence3 = j51Var.f25126n;
        TextView textView = d91Var.e;
        TextView textView2 = d91Var.f33066f;
        FrameLayout frameLayout = d91Var.f33065c;
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
        d91Var.f33064b.b(i11, i12);
        d91Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        d91Var.f33067n = !isEmpty;
        if (!isEmpty) {
            i14 = 0;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        d91Var.setValue(charSequence3);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new d91(context, f6Var);
    }
}
