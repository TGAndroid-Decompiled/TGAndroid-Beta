package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class k7 extends p61 {
    public static final int f35199a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        float f7;
        float f10;
        l7 l7Var = (l7) view;
        String charSequence = q61Var.f30063l.toString();
        long j3 = q61Var.B;
        int i10 = q61Var.f30076z;
        boolean z11 = q61Var.f30068q;
        TextView textView = l7Var.f35256c;
        TextView textView2 = l7Var.f35255b;
        textView2.setText(b7.X(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ka0(AndroidUtilities.dp(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) k0.q(j3, false));
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
        ImageView imageView = l7Var.d;
        if (z11) {
            f11 = 0.5f;
        }
        imageView.setAlpha(f11);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new l7(context, e6Var);
    }
}
