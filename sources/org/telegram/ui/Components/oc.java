package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class oc extends mb {
    public final j9 f27051a;
    public final n90 f27052b;
    public final n90 f27053c;
    public final LinearLayout d;

    public oc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var);
        j9 j9Var = new j9(context, false);
        this.f27051a = j9Var;
        j9Var.setStyle(11);
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(j9Var, w7.y5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            wb wbVar = new wb(context, 1, null);
            this.f27052b = wbVar;
            NotificationCenter.listenEmojiLoading(wbVar);
            wbVar.setTypeface(Typeface.SANS_SERIF);
            wbVar.setTextSize(1, 15.0f);
            wbVar.setEllipsize(TextUtils.TruncateAt.END);
            wbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            wbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(wbVar, w7.y5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.y5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            wb wbVar2 = new wb(context, 2, null);
            this.f27052b = wbVar2;
            NotificationCenter.listenEmojiLoading(wbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            wbVar2.setTypeface(typeface);
            wbVar2.setTextSize(1, 14.0f);
            wbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            wbVar2.setEllipsize(truncateAt);
            wbVar2.setMaxLines(1);
            linearLayout.addView(wbVar2);
            n90 n90Var = new n90(context, null);
            this.f27053c = n90Var;
            n90Var.setTypeface(typeface);
            n90Var.setTextSize(1, 12.0f);
            n90Var.setEllipsize(truncateAt);
            n90Var.setSingleLine(false);
            n90Var.setMaxLines(3);
            n90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
            linearLayout.addView(n90Var, w7.y5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f27052b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f27052b.getText();
    }

    public void setTextColor(int i10) {
        this.f27052b.setTextColor(i10);
        n90 n90Var = this.f27053c;
        if (n90Var != null) {
            n90Var.setTextColor(i10);
        }
    }
}
