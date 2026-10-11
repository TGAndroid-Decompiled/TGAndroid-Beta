package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class rc extends pb {
    public final m9 f30496a;
    public final ea0 f30497b;
    public final ea0 f30498c;
    public final LinearLayout d;

    public rc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var);
        m9 m9Var = new m9(context, false);
        this.f30496a = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(m9Var, w7.x5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            zb zbVar = new zb(context, 1, null);
            this.f30497b = zbVar;
            NotificationCenter.listenEmojiLoading(zbVar);
            zbVar.setTypeface(Typeface.SANS_SERIF);
            zbVar.setTextSize(1, 15.0f);
            zbVar.setEllipsize(TextUtils.TruncateAt.END);
            zbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            zbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(zbVar, w7.x5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.x5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            zb zbVar2 = new zb(context, 2, null);
            this.f30497b = zbVar2;
            NotificationCenter.listenEmojiLoading(zbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            zbVar2.setTypeface(typeface);
            zbVar2.setTextSize(1, 14.0f);
            zbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            zbVar2.setEllipsize(truncateAt);
            zbVar2.setMaxLines(1);
            linearLayout.addView(zbVar2);
            ea0 ea0Var = new ea0(context, null);
            this.f30498c = ea0Var;
            ea0Var.setTypeface(typeface);
            ea0Var.setTextSize(1, 12.0f);
            ea0Var.setEllipsize(truncateAt);
            ea0Var.setSingleLine(false);
            ea0Var.setMaxLines(3);
            ea0Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
            linearLayout.addView(ea0Var, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f30497b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f30497b.getText();
    }

    public void setTextColor(int i10) {
        this.f30497b.setTextColor(i10);
        ea0 ea0Var = this.f30498c;
        if (ea0Var != null) {
            ea0Var.setTextColor(i10);
        }
    }
}
