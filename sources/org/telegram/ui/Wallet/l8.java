package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.x70;
public final class l8 extends q31 {
    public static final int f42792b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        float f10;
        float f11;
        m8 m8Var = (m8) view;
        String charSequence = r31Var.f37627l.toString();
        long j10 = r31Var.B;
        int i3 = r31Var.f37640z;
        boolean z11 = r31Var.f37632q;
        TextView textView = m8Var.f42868c;
        TextView textView2 = m8Var.f42867b;
        textView2.setText(e8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j10 < 0) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131748787, null));
            spannableStringBuilder.setSpan(new x70(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) k0.s(j10, false));
        }
        if (i3 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(bd.V(null, null, 2131743060, spannableStringBuilder, bd.Q(i3)));
        }
        textView.setText(spannableStringBuilder);
        float f12 = 1.0f;
        if (z11) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        textView2.setAlpha(f10);
        if (z11) {
            f11 = 0.5f;
        } else {
            f11 = 1.0f;
        }
        textView.setAlpha(f11);
        ImageView imageView = m8Var.d;
        if (z11) {
            f12 = 0.5f;
        }
        imageView.setAlpha(f12);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new m8(context, e6Var);
    }
}
