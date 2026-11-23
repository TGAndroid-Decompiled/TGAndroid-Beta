package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r80;
public final class b9 extends n41 {
    public static final int f44003b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        float f10;
        float f11;
        c9 c9Var = (c9) view;
        String charSequence = o41Var.f38092m.toString();
        long j3 = o41Var.C;
        int i7 = o41Var.A;
        boolean z11 = o41Var.f38097r;
        TextView textView = c9Var.f44048c;
        TextView textView2 = c9Var.f44047b;
        textView2.setText(u8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) hd.N0(2131748586, null));
            spannableStringBuilder.setSpan(new r80(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) u0.x(j3, false));
        }
        if (i7 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(hd.V(null, null, 2131742784, spannableStringBuilder, hd.Q(i7)));
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
        ImageView imageView = c9Var.d;
        if (z11) {
            f12 = 0.5f;
        }
        imageView.setAlpha(f12);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new c9(context, h6Var);
    }
}
