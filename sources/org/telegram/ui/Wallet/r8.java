package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class r8 extends a51 {
    public static final int f35129b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        float f7;
        float f10;
        s8 s8Var = (s8) view;
        String charSequence = b51Var.f24643l.toString();
        long j10 = b51Var.B;
        int i10 = b51Var.f24656z;
        boolean z11 = b51Var.f24648q;
        TextView textView = s8Var.f35211c;
        TextView textView2 = s8Var.f35210b;
        textView2.setText(k8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j10 < 0) {
            spannableStringBuilder.append((CharSequence) dd.L0(2131748789, null));
            spannableStringBuilder.setSpan(new u80(org.telegram.messenger.i0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) k0.s(j10, false));
        }
        if (i10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(dd.V(null, null, 2131743076, spannableStringBuilder, dd.Q(i10)));
        }
        textView.setText(spannableStringBuilder);
        float f11 = 1.0f;
        if (z11) {
            f7 = 0.5f;
        } else {
            f7 = 1.0f;
        }
        textView2.setAlpha(f7);
        if (z11) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        textView.setAlpha(f10);
        ImageView imageView = s8Var.d;
        if (z11) {
            f11 = 0.5f;
        }
        imageView.setAlpha(f11);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new s8(context, p6Var);
    }
}
