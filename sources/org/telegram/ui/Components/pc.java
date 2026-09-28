package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class pc extends nb {
    public final k9 f27333a;
    public final p90 f27334b;
    public final p90 f27335c;
    public final LinearLayout d;

    public pc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var);
        k9 k9Var = new k9(context, false);
        this.f27333a = k9Var;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(k9Var, w7.y5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            xb xbVar = new xb(context, 1, null);
            this.f27334b = xbVar;
            NotificationCenter.listenEmojiLoading(xbVar);
            xbVar.setTypeface(Typeface.SANS_SERIF);
            xbVar.setTextSize(1, 15.0f);
            xbVar.setEllipsize(TextUtils.TruncateAt.END);
            xbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            xbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(xbVar, w7.y5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.y5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            xb xbVar2 = new xb(context, 2, null);
            this.f27334b = xbVar2;
            NotificationCenter.listenEmojiLoading(xbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            xbVar2.setTypeface(typeface);
            xbVar2.setTextSize(1, 14.0f);
            xbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            xbVar2.setEllipsize(truncateAt);
            xbVar2.setMaxLines(1);
            linearLayout.addView(xbVar2);
            p90 p90Var = new p90(context, null);
            this.f27335c = p90Var;
            p90Var.setTypeface(typeface);
            p90Var.setTextSize(1, 12.0f);
            p90Var.setEllipsize(truncateAt);
            p90Var.setSingleLine(false);
            p90Var.setMaxLines(3);
            p90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
            linearLayout.addView(p90Var, w7.y5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f27334b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f27334b.getText();
    }

    public void setTextColor(int i10) {
        this.f27334b.setTextColor(i10);
        p90 p90Var = this.f27335c;
        if (p90Var != null) {
            p90Var.setTextColor(i10);
        }
    }
}
