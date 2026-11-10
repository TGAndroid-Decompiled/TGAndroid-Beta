package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class n8 extends w31 {
    public static final int f42866b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        float f10;
        float f11;
        o8 o8Var = (o8) view;
        String charSequence = x31Var.f40156l.toString();
        long j3 = x31Var.B;
        int i7 = x31Var.f40169z;
        boolean z10 = x31Var.f40161q;
        TextView textView = o8Var.f42915c;
        TextView textView2 = o8Var.f42914b;
        textView2.setText(g8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) id.M0(2131748779, null));
            spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) l0.s(j3, false));
        }
        if (i7 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(id.V(null, null, 2131743050, spannableStringBuilder, id.Q(i7)));
        }
        textView.setText(spannableStringBuilder);
        float f12 = 1.0f;
        if (z10) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        textView2.setAlpha(f10);
        if (z10) {
            f11 = 0.5f;
        } else {
            f11 = 1.0f;
        }
        textView.setAlpha(f11);
        ImageView imageView = o8Var.d;
        if (z10) {
            f12 = 0.5f;
        }
        imageView.setAlpha(f12);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new o8(context, h6Var);
    }
}
