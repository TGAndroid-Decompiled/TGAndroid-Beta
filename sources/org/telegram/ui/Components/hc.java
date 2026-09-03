package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class hc extends eb {
    public final d9 f27464a;
    public final g90 f27465b;
    public final g90 f27466c;
    public final LinearLayout d;

    public hc(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, g6Var);
        d9 d9Var = new d9(context, false);
        this.f27464a = d9Var;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(d9Var, k7.c6.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z4) {
            fg.a2 a2Var = new fg.a2(context, 3, null);
            this.f27465b = a2Var;
            NotificationCenter.listenEmojiLoading(a2Var);
            a2Var.setTypeface(Typeface.SANS_SERIF);
            a2Var.setTextSize(1, 15.0f);
            a2Var.setEllipsize(TextUtils.TruncateAt.END);
            a2Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            a2Var.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(a2Var, k7.c6.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, k7.c6.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            fg.a2 a2Var2 = new fg.a2(context, 4, null);
            this.f27465b = a2Var2;
            NotificationCenter.listenEmojiLoading(a2Var2);
            Typeface typeface = Typeface.SANS_SERIF;
            a2Var2.setTypeface(typeface);
            a2Var2.setTextSize(1, 14.0f);
            a2Var2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            a2Var2.setEllipsize(truncateAt);
            a2Var2.setMaxLines(1);
            linearLayout.addView(a2Var2);
            g90 g90Var = new g90(context, null);
            this.f27466c = g90Var;
            g90Var.setTypeface(typeface);
            g90Var.setTextSize(1, 12.0f);
            g90Var.setEllipsize(truncateAt);
            g90Var.setSingleLine(false);
            g90Var.setMaxLines(3);
            g90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Gi));
            linearLayout.addView(g90Var, k7.c6.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f27465b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f27465b.getText();
    }

    public void setTextColor(int i10) {
        this.f27465b.setTextColor(i10);
        g90 g90Var = this.f27466c;
        if (g90Var != null) {
            g90Var.setTextColor(i10);
        }
    }
}
