package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class oc extends mb {
    public final j9 f26885a;
    public final k90 f26886b;
    public final k90 f26887c;
    public final LinearLayout d;

    public oc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var);
        j9 j9Var = new j9(context, false);
        this.f26885a = j9Var;
        j9Var.setStyle(11);
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(j9Var, w7.y5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            wb wbVar = new wb(context, 1, null);
            this.f26886b = wbVar;
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
            this.f26886b = wbVar2;
            NotificationCenter.listenEmojiLoading(wbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            wbVar2.setTypeface(typeface);
            wbVar2.setTextSize(1, 14.0f);
            wbVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            wbVar2.setEllipsize(truncateAt);
            wbVar2.setMaxLines(1);
            linearLayout.addView(wbVar2);
            k90 k90Var = new k90(context, null);
            this.f26887c = k90Var;
            k90Var.setTypeface(typeface);
            k90Var.setTextSize(1, 12.0f);
            k90Var.setEllipsize(truncateAt);
            k90Var.setSingleLine(false);
            k90Var.setMaxLines(3);
            k90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
            linearLayout.addView(k90Var, w7.y5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f26886b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f26886b.getText();
    }

    public void setTextColor(int i10) {
        this.f26886b.setTextColor(i10);
        k90 k90Var = this.f26887c;
        if (k90Var != null) {
            k90Var.setTextColor(i10);
        }
    }
}
