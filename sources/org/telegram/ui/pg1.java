package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pg1 extends FrameLayout {
    public final eg.c1 f37313a;

    public pg1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, k7.b6.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var), 100));
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UnlockPremiumStickersDescription));
        linearLayout.addView(textView, k7.b6.t(-1, -2, 0, 16, 17, 17, 16));
        eg.c1 c1Var = new eg.c1(context, f6Var, false);
        this.f37313a = c1Var;
        String string = LocaleController.getString(R.string.UnlockPremiumStickers);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.mq(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) string);
        c1Var.d.setText(spannableStringBuilder);
        linearLayout.addView(c1Var, k7.b6.t(-1, 48, 0, 16, 0, 16, 16));
    }
}
