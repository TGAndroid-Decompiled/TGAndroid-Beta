package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class pc extends nb {
    public final k9 f27314a;
    public final n90 f27315b;
    public final n90 f27316c;
    public final LinearLayout d;

    public pc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var);
        k9 k9Var = new k9(context, false);
        this.f27314a = k9Var;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(k9Var, w7.y5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            xb xbVar = new xb(context, 1, null);
            this.f27315b = xbVar;
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
            this.f27315b = xbVar2;
            NotificationCenter.listenEmojiLoading(xbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            xbVar2.setTypeface(typeface);
            xbVar2.setTextSize(1, 14.0f);
            xbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            xbVar2.setEllipsize(truncateAt);
            xbVar2.setMaxLines(1);
            linearLayout.addView(xbVar2);
            n90 n90Var = new n90(context, null);
            this.f27316c = n90Var;
            n90Var.setTypeface(typeface);
            n90Var.setTextSize(1, 12.0f);
            n90Var.setEllipsize(truncateAt);
            n90Var.setSingleLine(false);
            n90Var.setMaxLines(3);
            n90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
            linearLayout.addView(n90Var, w7.y5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f27315b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f27315b.getText();
    }

    public void setTextColor(int i10) {
        this.f27315b.setTextColor(i10);
        n90 n90Var = this.f27316c;
        if (n90Var != null) {
            n90Var.setTextColor(i10);
        }
    }
}
