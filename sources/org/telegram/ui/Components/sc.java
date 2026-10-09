package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class sc extends qb {
    public final m9 f30763a;
    public final ea0 f30764b;
    public final ea0 f30765c;
    public final LinearLayout d;

    public sc(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var);
        m9 m9Var = new m9(context, false);
        this.f30763a = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(m9Var, w7.x5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            ac acVar = new ac(context, 1, null);
            this.f30764b = acVar;
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
            this.f30764b = acVar2;
            NotificationCenter.listenEmojiLoading(acVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            acVar2.setTypeface(typeface);
            acVar2.setTextSize(1, 14.0f);
            acVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            acVar2.setEllipsize(truncateAt);
            acVar2.setMaxLines(1);
            linearLayout.addView(acVar2);
            ea0 ea0Var = new ea0(context, null);
            this.f30765c = ea0Var;
            ea0Var.setTypeface(typeface);
            ea0Var.setTextSize(1, 12.0f);
            ea0Var.setEllipsize(truncateAt);
            ea0Var.setSingleLine(false);
            ea0Var.setMaxLines(3);
            ea0Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
            linearLayout.addView(ea0Var, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f30764b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f30764b.getText();
    }

    public void setTextColor(int i10) {
        this.f30764b.setTextColor(i10);
        ea0 ea0Var = this.f30765c;
        if (ea0Var != null) {
            ea0Var.setTextColor(i10);
        }
    }
}
