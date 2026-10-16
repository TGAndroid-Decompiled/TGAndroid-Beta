package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class k91 extends org.telegram.ui.Components.l61 {
    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    public static org.telegram.ui.Components.m61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(k91.class);
        J.d = i10;
        J.f26945k = i13;
        J.f26946l = charSequence;
        J.f26947m = charSequence2;
        J.f26948n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        boolean z11;
        int i10;
        float f7;
        long j10 = m61Var.B;
        int i11 = (int) j10;
        int i12 = (int) (j10 >>> 32);
        l91 l91Var = (l91) view;
        int i13 = m61Var.f26945k;
        CharSequence charSequence = m61Var.f26946l;
        CharSequence charSequence2 = m61Var.f26947m;
        CharSequence charSequence3 = m61Var.f26948n;
        TextView textView = l91Var.e;
        TextView textView2 = l91Var.f37668f;
        int i14 = 0;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        l91Var.f37669n = z11;
        FrameLayout frameLayout = l91Var.f37667c;
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
        l91Var.f37666b.b(i11, i12);
        l91Var.d.setImageResource(i13);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        l91Var.f37670r = !isEmpty;
        if (isEmpty) {
            i14 = 8;
        }
        textView2.setVisibility(i14);
        textView2.setText(charSequence2);
        l91Var.setValue(charSequence3);
        l91Var.d();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new l91(context, c6Var);
    }
}
