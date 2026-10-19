package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class f8 extends f61 {
    public static final int f34212a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        float f7;
        float f10;
        g8 g8Var = (g8) view;
        String charSequence = g61Var.f26497l.toString();
        long j10 = g61Var.B;
        int i10 = g61Var.f26510z;
        boolean z11 = g61Var.f26502q;
        TextView textView = g8Var.f34255c;
        TextView textView2 = g8Var.f34254b;
        textView2.setText(w7.X(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j10 < 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ca0(AndroidUtilities.dp(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) m0.r(j10, false));
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
        ImageView imageView = g8Var.d;
        if (z11) {
            f11 = 0.5f;
        }
        imageView.setAlpha(f11);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new g8(context, d6Var);
    }
}
