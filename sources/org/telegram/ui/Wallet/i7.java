package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class i7 extends o61 {
    public static final int f35017a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        float f7;
        float f10;
        j7 j7Var = (j7) view;
        String charSequence = p61Var.f29734l.toString();
        long j3 = p61Var.B;
        int i10 = p61Var.f29747z;
        boolean z11 = p61Var.f29739q;
        TextView textView = j7Var.f35079c;
        TextView textView2 = j7Var.f35078b;
        textView2.setText(z6.X(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ja0(AndroidUtilities.dp(35.0f), textView), 0, spannableStringBuilder.length(), 33);
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
        ImageView imageView = j7Var.d;
        if (z11) {
            f11 = 0.5f;
        }
        imageView.setAlpha(f11);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new j7(context, e6Var);
    }
}
