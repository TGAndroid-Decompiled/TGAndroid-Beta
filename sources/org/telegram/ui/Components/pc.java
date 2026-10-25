package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class pc extends nb {
    public final m9 f31541a;
    public final z90 f31542b;
    public final z90 f31543c;
    public final LinearLayout d;

    public pc(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var);
        m9 m9Var = new m9(context, false);
        this.f31541a = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(m9Var, gb1.m(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            xb xbVar = new xb(context, 1, null);
            this.f31542b = xbVar;
            NotificationCenter.listenEmojiLoading(xbVar);
            xbVar.setTypeface(Typeface.SANS_SERIF);
            xbVar.setTextSize(1, 15.0f);
            xbVar.setEllipsize(TextUtils.TruncateAt.END);
            xbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            xbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(xbVar, gb1.m(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, gb1.m(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            xb xbVar2 = new xb(context, 2, null);
            this.f31542b = xbVar2;
            NotificationCenter.listenEmojiLoading(xbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            xbVar2.setTypeface(typeface);
            xbVar2.setTextSize(1, 14.0f);
            xbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            xbVar2.setEllipsize(truncateAt);
            xbVar2.setMaxLines(1);
            linearLayout.addView(xbVar2);
            z90 z90Var = new z90(context, null);
            this.f31543c = z90Var;
            z90Var.setTypeface(typeface);
            z90Var.setTextSize(1, 12.0f);
            z90Var.setEllipsize(truncateAt);
            z90Var.setSingleLine(false);
            z90Var.setMaxLines(3);
            org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.Gi, u6Var);
            linearLayout.addView(z90Var, gb1.x(-2, -2, 0, 0, 0, 0, 0));
        }
        org.telegram.ui.ActionBar.f7.H(this.f31542b, org.telegram.ui.ActionBar.y6.Gi, u6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f31542b.getText();
    }

    public void setTextColor(int i10) {
        this.f31542b.setTextColor(i10);
        z90 z90Var = this.f31543c;
        if (z90Var != null) {
            z90Var.setTextColor(i10);
        }
    }
}
