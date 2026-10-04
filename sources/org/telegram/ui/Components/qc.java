package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class qc extends ob {
    public final k9 f29991a;
    public final q90 f29992b;
    public final q90 f29993c;
    public final LinearLayout d;

    public qc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var);
        k9 k9Var = new k9(context, false);
        this.f29991a = k9Var;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(k9Var, w7.z5.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            yb ybVar = new yb(context, 1, null);
            this.f29992b = ybVar;
            NotificationCenter.listenEmojiLoading(ybVar);
            ybVar.setTypeface(Typeface.SANS_SERIF);
            ybVar.setTextSize(1, 15.0f);
            ybVar.setEllipsize(TextUtils.TruncateAt.END);
            ybVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            ybVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(ybVar, w7.z5.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.z5.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            yb ybVar2 = new yb(context, 2, null);
            this.f29992b = ybVar2;
            NotificationCenter.listenEmojiLoading(ybVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            ybVar2.setTypeface(typeface);
            ybVar2.setTextSize(1, 14.0f);
            ybVar2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            ybVar2.setEllipsize(truncateAt);
            ybVar2.setMaxLines(1);
            linearLayout.addView(ybVar2);
            q90 q90Var = new q90(context, null);
            this.f29993c = q90Var;
            q90Var.setTypeface(typeface);
            q90Var.setTextSize(1, 12.0f);
            q90Var.setEllipsize(truncateAt);
            q90Var.setSingleLine(false);
            q90Var.setMaxLines(3);
            q90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
            linearLayout.addView(q90Var, w7.z5.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f29992b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f29992b.getText();
    }

    public void setTextColor(int i10) {
        this.f29992b.setTextColor(i10);
        q90 q90Var = this.f29993c;
        if (q90Var != null) {
            q90Var.setTextColor(i10);
        }
    }
}
