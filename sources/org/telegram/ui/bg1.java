package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bg1 extends FrameLayout {
    public final sg.p0 f36071a;

    public bg1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, w7.z5.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.X(textView, org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.G6, 100), g6Var);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UnlockPremiumStickersDescription));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 0, 16, 17, 17, 16));
        sg.p0 p0Var = new sg.p0(context, g6Var, false);
        this.f36071a = p0Var;
        String string = LocaleController.getString(R.string.UnlockPremiumStickers);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.vq(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) string);
        p0Var.f46802f.setText(spannableStringBuilder);
        linearLayout.addView(p0Var, w7.z5.t(-1, 48, 0, 16, 0, 16, 16));
    }
}
