package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class l7 extends t61 {
    public static final int f35040a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        float f7;
        float f10;
        m7 m7Var = (m7) view;
        String charSequence = u61Var.f31071l.toString();
        long j3 = u61Var.B;
        int i10 = u61Var.f31084z;
        boolean z11 = u61Var.f31076q;
        TextView textView = m7Var.f35090c;
        TextView textView2 = m7Var.f35089b;
        textView2.setText(c7.X(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new na0(AndroidUtilities.dp(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) l0.q(j3, false));
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
        ImageView imageView = m7Var.d;
        if (z11) {
            f11 = 0.5f;
        }
        imageView.setAlpha(f11);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new m7(context, c6Var);
    }
}
