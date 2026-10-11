package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class rc extends pb {
    public final m9 f30436a;
    public final fa0 f30437b;
    public final fa0 f30438c;
    public final LinearLayout d;

    public rc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var);
        m9 m9Var = new m9(context, false);
        this.f30436a = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(m9Var, w7.x5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            zb zbVar = new zb(context, 1, null);
            this.f30437b = zbVar;
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
            this.f30437b = zbVar2;
            NotificationCenter.listenEmojiLoading(zbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            zbVar2.setTypeface(typeface);
            zbVar2.setTextSize(1, 14.0f);
            zbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            zbVar2.setEllipsize(truncateAt);
            zbVar2.setMaxLines(1);
            linearLayout.addView(zbVar2);
            fa0 fa0Var = new fa0(context, null);
            this.f30438c = fa0Var;
            fa0Var.setTypeface(typeface);
            fa0Var.setTextSize(1, 12.0f);
            fa0Var.setEllipsize(truncateAt);
            fa0Var.setSingleLine(false);
            fa0Var.setMaxLines(3);
            fa0Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
            linearLayout.addView(fa0Var, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f30437b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f30437b.getText();
    }

    public void setTextColor(int i10) {
        this.f30437b.setTextColor(i10);
        fa0 fa0Var = this.f30438c;
        if (fa0Var != null) {
            fa0Var.setTextColor(i10);
        }
    }
}
