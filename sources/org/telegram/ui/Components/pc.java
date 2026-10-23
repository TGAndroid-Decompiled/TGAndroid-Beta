package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class pc extends nb {
    public final k9 f29508a;
    public final y90 f29509b;
    public final y90 f29510c;
    public final LinearLayout d;

    public pc(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var);
        k9 k9Var = new k9(context, false);
        this.f29508a = k9Var;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(k9Var, w7.z5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            xb xbVar = new xb(context, 1, null);
            this.f29509b = xbVar;
            NotificationCenter.listenEmojiLoading(xbVar);
            xbVar.setTypeface(Typeface.SANS_SERIF);
            xbVar.setTextSize(1, 15.0f);
            xbVar.setEllipsize(TextUtils.TruncateAt.END);
            xbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            xbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(xbVar, w7.z5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.z5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            xb xbVar2 = new xb(context, 2, null);
            this.f29509b = xbVar2;
            NotificationCenter.listenEmojiLoading(xbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            xbVar2.setTypeface(typeface);
            xbVar2.setTextSize(1, 14.0f);
            xbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            xbVar2.setEllipsize(truncateAt);
            xbVar2.setMaxLines(1);
            linearLayout.addView(xbVar2);
            y90 y90Var = new y90(context, null);
            this.f29510c = y90Var;
            y90Var.setTypeface(typeface);
            y90Var.setTextSize(1, 12.0f);
            y90Var.setEllipsize(truncateAt);
            y90Var.setSingleLine(false);
            y90Var.setMaxLines(3);
            org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.Gi, g6Var);
            linearLayout.addView(y90Var, w7.z5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        org.telegram.ui.ActionBar.r6.I(this.f29509b, org.telegram.ui.ActionBar.k6.Gi, g6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f29509b.getText();
    }

    public void setTextColor(int i10) {
        this.f29509b.setTextColor(i10);
        y90 y90Var = this.f29510c;
        if (y90Var != null) {
            y90Var.setTextColor(i10);
        }
    }
}
