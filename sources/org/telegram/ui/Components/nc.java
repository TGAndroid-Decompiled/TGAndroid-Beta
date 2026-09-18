package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class nc extends lb {
    public final i9 f26438a;
    public final c90 f26439b;
    public final c90 f26440c;
    public final LinearLayout d;

    public nc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var);
        i9 i9Var = new i9(context, false);
        this.f26438a = i9Var;
        i9Var.setStyle(11);
        i9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(i9Var, w7.x5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            vb vbVar = new vb(context, 1, null);
            this.f26439b = vbVar;
            NotificationCenter.listenEmojiLoading(vbVar);
            vbVar.setTypeface(Typeface.SANS_SERIF);
            vbVar.setTextSize(1, 15.0f);
            vbVar.setEllipsize(TextUtils.TruncateAt.END);
            vbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            vbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(vbVar, w7.x5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.x5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            vb vbVar2 = new vb(context, 2, null);
            this.f26439b = vbVar2;
            NotificationCenter.listenEmojiLoading(vbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            vbVar2.setTypeface(typeface);
            vbVar2.setTextSize(1, 14.0f);
            vbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vbVar2.setEllipsize(truncateAt);
            vbVar2.setMaxLines(1);
            linearLayout.addView(vbVar2);
            c90 c90Var = new c90(context, null);
            this.f26440c = c90Var;
            c90Var.setTypeface(typeface);
            c90Var.setTextSize(1, 12.0f);
            c90Var.setEllipsize(truncateAt);
            c90Var.setSingleLine(false);
            c90Var.setMaxLines(3);
            c90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
            linearLayout.addView(c90Var, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f26439b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f26439b.getText();
    }

    public void setTextColor(int i10) {
        this.f26439b.setTextColor(i10);
        c90 c90Var = this.f26440c;
        if (c90Var != null) {
            c90Var.setTextColor(i10);
        }
    }
}
