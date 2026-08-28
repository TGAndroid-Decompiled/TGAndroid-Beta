package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class fc extends eb {
    public final c9 f28372a;
    public final l80 f28373b;
    public final l80 f28374c;
    public final LinearLayout d;

    public fc(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, b6Var);
        c9 c9Var = new c9(context, false);
        this.f28372a = c9Var;
        c9Var.setStyle(11);
        c9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(c9Var, g7.e6.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            fh.e4 e4Var = new fh.e4(context, 2, null);
            this.f28373b = e4Var;
            NotificationCenter.listenEmojiLoading(e4Var);
            e4Var.setTypeface(Typeface.SANS_SERIF);
            e4Var.setTextSize(1, 15.0f);
            e4Var.setEllipsize(TextUtils.TruncateAt.END);
            e4Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            e4Var.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(e4Var, g7.e6.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, g7.e6.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            fh.e4 e4Var2 = new fh.e4(context, 3, null);
            this.f28373b = e4Var2;
            NotificationCenter.listenEmojiLoading(e4Var2);
            Typeface typeface = Typeface.SANS_SERIF;
            e4Var2.setTypeface(typeface);
            e4Var2.setTextSize(1, 14.0f);
            e4Var2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            e4Var2.setEllipsize(truncateAt);
            e4Var2.setMaxLines(1);
            linearLayout.addView(e4Var2);
            l80 l80Var = new l80(context, null);
            this.f28374c = l80Var;
            l80Var.setTypeface(typeface);
            l80Var.setTextSize(1, 12.0f);
            l80Var.setEllipsize(truncateAt);
            l80Var.setSingleLine(false);
            l80Var.setMaxLines(3);
            l80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Gi));
            linearLayout.addView(l80Var, g7.e6.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f28373b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f28373b.getText();
    }

    public void setTextColor(int i9) {
        this.f28373b.setTextColor(i9);
        l80 l80Var = this.f28374c;
        if (l80Var != null) {
            l80Var.setTextColor(i9);
        }
    }
}
