package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class hc extends eb {
    public final d9 f25374a;
    public final f90 f25375b;
    public final f90 f25376c;
    public final LinearLayout d;

    public hc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var);
        d9 d9Var = new d9(context, false);
        this.f25374a = d9Var;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(d9Var, k7.b6.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z4) {
            eg.b2 b2Var = new eg.b2(context, 3, null);
            this.f25375b = b2Var;
            NotificationCenter.listenEmojiLoading(b2Var);
            b2Var.setTypeface(Typeface.SANS_SERIF);
            b2Var.setTextSize(1, 15.0f);
            b2Var.setEllipsize(TextUtils.TruncateAt.END);
            b2Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            b2Var.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(b2Var, k7.b6.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, k7.b6.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            eg.b2 b2Var2 = new eg.b2(context, 4, null);
            this.f25375b = b2Var2;
            NotificationCenter.listenEmojiLoading(b2Var2);
            Typeface typeface = Typeface.SANS_SERIF;
            b2Var2.setTypeface(typeface);
            b2Var2.setTextSize(1, 14.0f);
            b2Var2.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            b2Var2.setEllipsize(truncateAt);
            b2Var2.setMaxLines(1);
            linearLayout.addView(b2Var2);
            f90 f90Var = new f90(context, null);
            this.f25376c = f90Var;
            f90Var.setTypeface(typeface);
            f90Var.setTextSize(1, 12.0f);
            f90Var.setEllipsize(truncateAt);
            f90Var.setSingleLine(false);
            f90Var.setMaxLines(3);
            f90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
            linearLayout.addView(f90Var, k7.b6.t(-2, -2, 0, 0, 0, 0, 0));
        }
        this.f25375b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f25375b.getText();
    }

    public void setTextColor(int i10) {
        this.f25375b.setTextColor(i10);
        f90 f90Var = this.f25376c;
        if (f90Var != null) {
            f90Var.setTextColor(i10);
        }
    }
}
