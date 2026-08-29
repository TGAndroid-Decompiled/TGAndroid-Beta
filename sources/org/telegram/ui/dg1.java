package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dg1 extends FrameLayout {
    public final cg.d1 f37541a;

    public dg1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, i7.f6.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var), 100));
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UnlockPremiumStickersDescription));
        linearLayout.addView(textView, i7.f6.t(-1, -2, 0, 16, 17, 17, 16));
        cg.d1 d1Var = new cg.d1(context, c6Var, false);
        this.f37541a = d1Var;
        String string = LocaleController.getString(R.string.UnlockPremiumStickers);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.iq(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) string);
        d1Var.d.setText(spannableStringBuilder);
        linearLayout.addView(d1Var, i7.f6.t(-1, 48, 0, 16, 0, 16, 16));
    }
}
