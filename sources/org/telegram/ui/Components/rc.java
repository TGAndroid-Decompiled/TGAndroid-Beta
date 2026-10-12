package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class rc extends pb {
    public final m9 f30138a;
    public final ia0 f30139b;
    public final ia0 f30140c;
    public final LinearLayout d;

    public rc(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var);
        m9 m9Var = new m9(context, false);
        this.f30138a = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(m9Var, w7.w5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            zb zbVar = new zb(context, 1, null);
            this.f30139b = zbVar;
            NotificationCenter.listenEmojiLoading(zbVar);
            zbVar.setTypeface(Typeface.SANS_SERIF);
            zbVar.setTextSize(1, 15.0f);
            zbVar.setEllipsize(TextUtils.TruncateAt.END);
            zbVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            zbVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(zbVar, w7.w5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.w5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            zb zbVar2 = new zb(context, 2, null);
            this.f30139b = zbVar2;
            NotificationCenter.listenEmojiLoading(zbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            zbVar2.setTypeface(typeface);
            zbVar2.setTextSize(1, 14.0f);
            zbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            zbVar2.setEllipsize(truncateAt);
            zbVar2.setMaxLines(1);
            linearLayout.addView(zbVar2);
            ia0 ia0Var = new ia0(context, null);
            this.f30140c = ia0Var;
            ia0Var.setTypeface(typeface);
            ia0Var.setTextSize(1, 12.0f);
            ia0Var.setEllipsize(truncateAt);
            ia0Var.setSingleLine(false);
            ia0Var.setMaxLines(3);
            ia0Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
            linearLayout.addView(ia0Var, w7.w5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f30139b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f30139b.getText();
    }

    public void setTextColor(int i10) {
        this.f30139b.setTextColor(i10);
        ia0 ia0Var = this.f30140c;
        if (ia0Var != null) {
            ia0Var.setTextColor(i10);
        }
    }
}
