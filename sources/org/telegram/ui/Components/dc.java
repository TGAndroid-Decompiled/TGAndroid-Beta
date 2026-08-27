package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;

public final class dc extends cb {

    public final b9 f27706a;

    public final p80 f27707b;

    public final p80 f27708c;
    public final LinearLayout d;

    public dc(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var);
        b9 b9Var = new b9(context, false);
        this.f27706a = b9Var;
        b9Var.setStyle(11);
        b9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(b9Var, h7.z5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, h7.z5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            ag.v2 v2Var = new ag.v2(context, 4, null);
            this.f27707b = v2Var;
            NotificationCenter.listenEmojiLoading(v2Var);
            Typeface typeface = Typeface.SANS_SERIF;
            v2Var.setTypeface(typeface);
            v2Var.setTextSize(1, 14.0f);
            v2Var.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            v2Var.setEllipsize(truncateAt);
            v2Var.setMaxLines(1);
            linearLayout.addView(v2Var);
            p80 p80Var = new p80(context, null);
            this.f27708c = p80Var;
            p80Var.setTypeface(typeface);
            p80Var.setTextSize(1, 12.0f);
            p80Var.setEllipsize(truncateAt);
            p80Var.setSingleLine(false);
            p80Var.setMaxLines(3);
            p80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
            linearLayout.addView(p80Var, h7.z5.t(-2, -2, 0, 0, 0, 0, 0));
        } else {
            ag.v2 v2Var2 = new ag.v2(context, 3, null);
            this.f27707b = v2Var2;
            NotificationCenter.listenEmojiLoading(v2Var2);
            v2Var2.setTypeface(Typeface.SANS_SERIF);
            v2Var2.setTextSize(1, 15.0f);
            v2Var2.setEllipsize(TextUtils.TruncateAt.END);
            v2Var2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            v2Var2.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(v2Var2, h7.z5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        }
        this.f27707b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f27707b.getText();
    }

    public void setTextColor(int i10) {
        this.f27707b.setTextColor(i10);
        p80 p80Var = this.f27708c;
        if (p80Var != null) {
            p80Var.setTextColor(i10);
        }
    }
}
