package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class j7 extends l61 {
    public static final int f33065a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        float f7;
        float f10;
        k7 k7Var = (k7) view;
        String charSequence = m61Var.f26946l.toString();
        long j10 = m61Var.B;
        int i10 = m61Var.f26959z;
        boolean z11 = m61Var.f26951q;
        TextView textView = k7Var.f33135c;
        TextView textView2 = k7Var.f33134b;
        textView2.setText(a7.X(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j10 < 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ia0(AndroidUtilities.dp(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) k0.q(j10, false));
        }
        if (i10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatSpannable(R.string.WalletPreviousWalletLastUsed, spannableStringBuilder, LocaleController.formatShortDateTime(i10)));
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
        ImageView imageView = k7Var.d;
        if (z11) {
            f11 = 0.5f;
        }
        imageView.setAlpha(f11);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new k7(context, c6Var);
    }
}
