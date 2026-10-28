package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gg1 extends FrameLayout {
    public final tg.p0 f39613a;

    public gg1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, org.telegram.ui.Components.kb1.i(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.f7.W(textView, org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.G6, 100), u6Var);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UnlockPremiumStickersDescription));
        linearLayout.addView(textView, org.telegram.ui.Components.kb1.x(-1, -2, 0, 16, 17, 17, 16));
        tg.p0 p0Var = new tg.p0(context, u6Var, false);
        this.f39613a = p0Var;
        String string = LocaleController.getString(R.string.UnlockPremiumStickers);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.zq(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) string);
        p0Var.f49016f.setText(spannableStringBuilder);
        linearLayout.addView(p0Var, org.telegram.ui.Components.kb1.x(-1, 48, 0, 16, 0, 16, 16));
    }
}
