package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
public final class zb extends ya {
    public final x8 f40994a;
    public final s70 f40995b;
    public final s70 f40996c;
    public final LinearLayout d;

    public zb(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var);
        x8 x8Var = new x8(context, false);
        this.f40994a = x8Var;
        x8Var.setStyle(11);
        x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(x8Var, b8.mf.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            ai.e2 e2Var = new ai.e2(4, context, null);
            this.f40995b = e2Var;
            org.telegram.messenger.hs.i(e2Var);
            e2Var.setTypeface(Typeface.SANS_SERIF);
            e2Var.setTextSize(1, 15.0f);
            e2Var.setEllipsize(TextUtils.TruncateAt.END);
            e2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            e2Var.setGravity(org.telegram.messenger.bd.f21784a0 ? 5 : 3);
            addView(e2Var, b8.mf.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, b8.mf.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            ai.e2 e2Var2 = new ai.e2(5, context, null);
            this.f40995b = e2Var2;
            org.telegram.messenger.hs.i(e2Var2);
            Typeface typeface = Typeface.SANS_SERIF;
            e2Var2.setTypeface(typeface);
            e2Var2.setTextSize(1, 14.0f);
            e2Var2.setTypeface(org.telegram.messenger.g0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            e2Var2.setEllipsize(truncateAt);
            e2Var2.setMaxLines(1);
            linearLayout.addView(e2Var2);
            s70 s70Var = new s70(context, null);
            this.f40996c = s70Var;
            s70Var.setTypeface(typeface);
            s70Var.setTextSize(1, 12.0f);
            s70Var.setEllipsize(truncateAt);
            s70Var.setSingleLine(false);
            s70Var.setMaxLines(3);
            org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.uj, e6Var);
            linearLayout.addView(s70Var, b8.mf.t(-2, -2, 0, 0, 0, 0, 0));
        }
        org.telegram.ui.ActionBar.r6.H(this.f40995b, org.telegram.ui.ActionBar.k6.uj, e6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f40995b.getText();
    }

    public void setTextColor(int i3) {
        this.f40995b.setTextColor(i3);
        s70 s70Var = this.f40996c;
        if (s70Var != null) {
            s70Var.setTextColor(i3);
        }
    }
}
