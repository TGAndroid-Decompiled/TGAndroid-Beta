package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class pc extends nb {
    public final l9 f29347a;
    public final d90 f29348b;
    public final d90 f29349c;
    public final LinearLayout d;

    public pc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var);
        l9 l9Var = new l9(context, false);
        this.f29347a = l9Var;
        l9Var.setStyle(11);
        l9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(l9Var, w7.x5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            xb xbVar = new xb(context, 1, null);
            this.f29348b = xbVar;
            NotificationCenter.listenEmojiLoading(xbVar);
            xbVar.setTypeface(Typeface.SANS_SERIF);
            xbVar.setTextSize(1, 15.0f);
            xbVar.setEllipsize(TextUtils.TruncateAt.END);
            xbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            xbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(xbVar, w7.x5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.x5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            xb xbVar2 = new xb(context, 2, null);
            this.f29348b = xbVar2;
            NotificationCenter.listenEmojiLoading(xbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            xbVar2.setTypeface(typeface);
            xbVar2.setTextSize(1, 14.0f);
            xbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            xbVar2.setEllipsize(truncateAt);
            xbVar2.setMaxLines(1);
            linearLayout.addView(xbVar2);
            d90 d90Var = new d90(context, null);
            this.f29349c = d90Var;
            d90Var.setTypeface(typeface);
            d90Var.setTextSize(1, 12.0f);
            d90Var.setEllipsize(truncateAt);
            d90Var.setSingleLine(false);
            d90Var.setMaxLines(3);
            d90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
            linearLayout.addView(d90Var, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f29348b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f29348b.getText();
    }

    public void setTextColor(int i10) {
        this.f29348b.setTextColor(i10);
        d90 d90Var = this.f29349c;
        if (d90Var != null) {
            d90Var.setTextColor(i10);
        }
    }
}
