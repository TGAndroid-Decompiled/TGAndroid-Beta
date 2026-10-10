package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class sc extends qb {
    public final m9 f30755a;
    public final fa0 f30756b;
    public final fa0 f30757c;
    public final LinearLayout d;

    public sc(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var);
        m9 m9Var = new m9(context, false);
        this.f30755a = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(m9Var, w7.x5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            ac acVar = new ac(context, 1, null);
            this.f30756b = acVar;
            NotificationCenter.listenEmojiLoading(acVar);
            acVar.setTypeface(Typeface.SANS_SERIF);
            acVar.setTextSize(1, 15.0f);
            acVar.setEllipsize(TextUtils.TruncateAt.END);
            acVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            acVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(acVar, w7.x5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.x5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            ac acVar2 = new ac(context, 2, null);
            this.f30756b = acVar2;
            NotificationCenter.listenEmojiLoading(acVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            acVar2.setTypeface(typeface);
            acVar2.setTextSize(1, 14.0f);
            acVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            acVar2.setEllipsize(truncateAt);
            acVar2.setMaxLines(1);
            linearLayout.addView(acVar2);
            fa0 fa0Var = new fa0(context, null);
            this.f30757c = fa0Var;
            fa0Var.setTypeface(typeface);
            fa0Var.setTextSize(1, 12.0f);
            fa0Var.setEllipsize(truncateAt);
            fa0Var.setSingleLine(false);
            fa0Var.setMaxLines(3);
            fa0Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
            linearLayout.addView(fa0Var, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f30756b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f30756b.getText();
    }

    public void setTextColor(int i10) {
        this.f30756b.setTextColor(i10);
        fa0 fa0Var = this.f30757c;
        if (fa0Var != null) {
            fa0Var.setTextColor(i10);
        }
    }
}
