package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class e91 extends org.telegram.ui.Components.p61 {
    static {
        org.telegram.ui.Components.p61.setup(new org.telegram.ui.Components.p61());
    }

    public static org.telegram.ui.Components.q61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.q61 J = org.telegram.ui.Components.q61.J(e91.class);
        J.d = i10;
        J.f30062k = i13;
        J.f30063l = charSequence;
        J.f30064m = charSequence2;
        J.f30065n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.q61 q61Var, boolean z10, org.telegram.ui.Components.d71 d71Var, org.telegram.ui.Components.l71 l71Var) {
        boolean z11;
        int i10;
        float f7;
        long j3 = q61Var.B;
        int i11 = (int) j3;
        int i12 = (int) (j3 >>> 32);
        f91 f91Var = (f91) view;
        int i13 = q61Var.f30062k;
        CharSequence charSequence = q61Var.f30063l;
        CharSequence charSequence2 = q61Var.f30064m;
        CharSequence charSequence3 = q61Var.f30065n;
        TextView textView = f91Var.f37539e;
        TextView textView2 = f91Var.f37540f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        f91Var.f37541n = z11;
        FrameLayout frameLayout = f91Var.f37538c;
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
        f91Var.f37537b.b(i11, i12);
        f91Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        f91Var.f37542r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        f91Var.setValue(charSequence3);
        f91Var.e();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new f91(context, e6Var);
    }
}
