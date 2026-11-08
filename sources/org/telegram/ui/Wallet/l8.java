package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class l8 extends w31 {
    public static final int f42746b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        float f10;
        float f11;
        m8 m8Var = (m8) view;
        String charSequence = x31Var.f40180l.toString();
        long j3 = x31Var.B;
        int i7 = x31Var.f40193z;
        boolean z10 = x31Var.f40185q;
        TextView textView = m8Var.f42813c;
        TextView textView2 = m8Var.f42812b;
        textView2.setText(e8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) id.M0(2131748780, null));
            spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) m0.s(j3, false));
        }
        if (i7 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(id.V(null, null, 2131743053, spannableStringBuilder, id.Q(i7)));
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
        ImageView imageView = m8Var.d;
        if (z10) {
            f12 = 0.5f;
        }
        imageView.setAlpha(f12);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new m8(context, f6Var);
    }
}
