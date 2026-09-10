package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class oc extends mb {
    public final j9 f25757a;
    public final m90 f25758b;
    public final m90 f25759c;
    public final LinearLayout d;

    public oc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var);
        j9 j9Var = new j9(context, false);
        this.f25757a = j9Var;
        j9Var.setStyle(11);
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(j9Var, w7.a6.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            wb wbVar = new wb(context, 1, null);
            this.f25758b = wbVar;
            NotificationCenter.listenEmojiLoading(wbVar);
            wbVar.setTypeface(Typeface.SANS_SERIF);
            wbVar.setTextSize(1, 15.0f);
            wbVar.setEllipsize(TextUtils.TruncateAt.END);
            wbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            wbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(wbVar, w7.a6.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.a6.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            wb wbVar2 = new wb(context, 2, null);
            this.f25758b = wbVar2;
            NotificationCenter.listenEmojiLoading(wbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            wbVar2.setTypeface(typeface);
            wbVar2.setTextSize(1, 14.0f);
            wbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            wbVar2.setEllipsize(truncateAt);
            wbVar2.setMaxLines(1);
            linearLayout.addView(wbVar2);
            m90 m90Var = new m90(context, null);
            this.f25759c = m90Var;
            m90Var.setTypeface(typeface);
            m90Var.setTextSize(1, 12.0f);
            m90Var.setEllipsize(truncateAt);
            m90Var.setSingleLine(false);
            m90Var.setMaxLines(3);
            m90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
            linearLayout.addView(m90Var, w7.a6.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f25758b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f25758b.getText();
    }

    public void setTextColor(int i10) {
        this.f25758b.setTextColor(i10);
        m90 m90Var = this.f25759c;
        if (m90Var != null) {
            m90Var.setTextColor(i10);
        }
    }
}
