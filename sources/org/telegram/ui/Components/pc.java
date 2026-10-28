package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class pc extends nb {
    public final m9 f31568a;
    public final aa0 f31569b;
    public final aa0 f31570c;
    public final LinearLayout d;

    public pc(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var);
        m9 m9Var = new m9(context, false);
        this.f31568a = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(m9Var, kb1.m(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            xb xbVar = new xb(context, 1, null);
            this.f31569b = xbVar;
            NotificationCenter.listenEmojiLoading(xbVar);
            xbVar.setTypeface(Typeface.SANS_SERIF);
            xbVar.setTextSize(1, 15.0f);
            xbVar.setEllipsize(TextUtils.TruncateAt.END);
            xbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            xbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(xbVar, kb1.m(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, kb1.m(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            xb xbVar2 = new xb(context, 2, null);
            this.f31569b = xbVar2;
            NotificationCenter.listenEmojiLoading(xbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            xbVar2.setTypeface(typeface);
            xbVar2.setTextSize(1, 14.0f);
            xbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            xbVar2.setEllipsize(truncateAt);
            xbVar2.setMaxLines(1);
            linearLayout.addView(xbVar2);
            aa0 aa0Var = new aa0(context, null);
            this.f31570c = aa0Var;
            aa0Var.setTypeface(typeface);
            aa0Var.setTextSize(1, 12.0f);
            aa0Var.setEllipsize(truncateAt);
            aa0Var.setSingleLine(false);
            aa0Var.setMaxLines(3);
            org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.Gi, u6Var);
            linearLayout.addView(aa0Var, kb1.x(-2, -2, 0, 0, 0, 0, 0));
        }
        org.telegram.ui.ActionBar.f7.H(this.f31569b, org.telegram.ui.ActionBar.y6.Gi, u6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f31569b.getText();
    }

    public void setTextColor(int i10) {
        this.f31569b.setTextColor(i10);
        aa0 aa0Var = this.f31570c;
        if (aa0Var != null) {
            aa0Var.setTextColor(i10);
        }
    }
}
