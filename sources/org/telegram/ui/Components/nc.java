package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class nc extends lb {
    public final i9 f28864a;
    public final w90 f28865b;
    public final w90 f28866c;
    public final LinearLayout d;

    public nc(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var);
        i9 i9Var = new i9(context, false);
        this.f28864a = i9Var;
        i9Var.setStyle(11);
        i9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(i9Var, w7.z5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            vb vbVar = new vb(context, 1, null);
            this.f28865b = vbVar;
            NotificationCenter.listenEmojiLoading(vbVar);
            vbVar.setTypeface(Typeface.SANS_SERIF);
            vbVar.setTextSize(1, 15.0f);
            vbVar.setEllipsize(TextUtils.TruncateAt.END);
            vbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            vbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(vbVar, w7.z5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.z5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            vb vbVar2 = new vb(context, 2, null);
            this.f28865b = vbVar2;
            NotificationCenter.listenEmojiLoading(vbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            vbVar2.setTypeface(typeface);
            vbVar2.setTextSize(1, 14.0f);
            vbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vbVar2.setEllipsize(truncateAt);
            vbVar2.setMaxLines(1);
            linearLayout.addView(vbVar2);
            w90 w90Var = new w90(context, null);
            this.f28866c = w90Var;
            w90Var.setTypeface(typeface);
            w90Var.setTextSize(1, 12.0f);
            w90Var.setEllipsize(truncateAt);
            w90Var.setSingleLine(false);
            w90Var.setMaxLines(3);
            org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.Gi, g6Var);
            linearLayout.addView(w90Var, w7.z5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        org.telegram.ui.ActionBar.r6.I(this.f28865b, org.telegram.ui.ActionBar.k6.Gi, g6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f28865b.getText();
    }

    public void setTextColor(int i10) {
        this.f28865b.setTextColor(i10);
        w90 w90Var = this.f28866c;
        if (w90Var != null) {
            w90Var.setTextColor(i10);
        }
    }
}
