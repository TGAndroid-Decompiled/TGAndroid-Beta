package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class rc extends pb {
    public final n9 f28803a;
    public final da0 f28804b;
    public final da0 f28805c;
    public final LinearLayout d;

    public rc(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var);
        n9 n9Var = new n9(context, false);
        this.f28803a = n9Var;
        n9Var.setStyle(11);
        n9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(n9Var, w7.a6.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            zb zbVar = new zb(context, 1, null);
            this.f28804b = zbVar;
            NotificationCenter.listenEmojiLoading(zbVar);
            zbVar.setTypeface(Typeface.SANS_SERIF);
            zbVar.setTextSize(1, 15.0f);
            zbVar.setEllipsize(TextUtils.TruncateAt.END);
            zbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            zbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(zbVar, w7.a6.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.a6.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            zb zbVar2 = new zb(context, 2, null);
            this.f28804b = zbVar2;
            NotificationCenter.listenEmojiLoading(zbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            zbVar2.setTypeface(typeface);
            zbVar2.setTextSize(1, 14.0f);
            zbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            zbVar2.setEllipsize(truncateAt);
            zbVar2.setMaxLines(1);
            linearLayout.addView(zbVar2);
            da0 da0Var = new da0(context, null);
            this.f28805c = da0Var;
            da0Var.setTypeface(typeface);
            da0Var.setTextSize(1, 12.0f);
            da0Var.setEllipsize(truncateAt);
            da0Var.setSingleLine(false);
            da0Var.setMaxLines(3);
            da0Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
            linearLayout.addView(da0Var, w7.a6.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f28804b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f28804b.getText();
    }

    public void setTextColor(int i10) {
        this.f28804b.setTextColor(i10);
        da0 da0Var = this.f28805c;
        if (da0Var != null) {
            da0Var.setTextColor(i10);
        }
    }
}
