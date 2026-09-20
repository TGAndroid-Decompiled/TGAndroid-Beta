package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jh1 extends FrameLayout {
    public final rg.p0 f34930a;

    public jh1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, w7.y5.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var), 100));
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UnlockPremiumStickersDescription));
        linearLayout.addView(textView, w7.y5.t(-1, -2, 0, 16, 17, 17, 16));
        rg.p0 p0Var = new rg.p0(context, f6Var, false);
        this.f34930a = p0Var;
        String string = LocaleController.getString(R.string.UnlockPremiumStickers);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.oq(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) string);
        p0Var.d.setText(spannableStringBuilder);
        linearLayout.addView(p0Var, w7.y5.t(-1, 48, 0, 16, 0, 16, 16));
    }
}
