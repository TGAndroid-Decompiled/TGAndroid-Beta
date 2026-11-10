package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
public final class ac extends ya {
    public final y8 f31812a;
    public final w70 f31813b;
    public final w70 f31814c;
    public final LinearLayout d;

    public ac(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context, h6Var);
        y8 y8Var = new y8(context, false);
        this.f31812a = y8Var;
        y8Var.setStyle(11);
        y8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(y8Var, c8.ha.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z9) {
            ib ibVar = new ib(1, context, null);
            this.f31813b = ibVar;
            org.telegram.messenger.qs.i(ibVar);
            ibVar.setTypeface(Typeface.SANS_SERIF);
            ibVar.setTextSize(1, 15.0f);
            ibVar.setEllipsize(TextUtils.TruncateAt.END);
            ibVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            ibVar.setGravity(org.telegram.messenger.id.f23161a0 ? 5 : 3);
            addView(ibVar, c8.ha.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, c8.ha.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            ib ibVar2 = new ib(2, context, null);
            this.f31813b = ibVar2;
            org.telegram.messenger.qs.i(ibVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            ibVar2.setTypeface(typeface);
            ibVar2.setTextSize(1, 14.0f);
            ibVar2.setTypeface(org.telegram.messenger.g0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            ibVar2.setEllipsize(truncateAt);
            ibVar2.setMaxLines(1);
            linearLayout.addView(ibVar2);
            w70 w70Var = new w70(context, null);
            this.f31814c = w70Var;
            w70Var.setTypeface(typeface);
            w70Var.setTextSize(1, 12.0f);
            w70Var.setEllipsize(truncateAt);
            w70Var.setSingleLine(false);
            w70Var.setMaxLines(3);
            org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.uj, h6Var);
            linearLayout.addView(w70Var, c8.ha.t(-2, -2, 0, 0, 0, 0, 0));
        }
        org.telegram.ui.ActionBar.t6.G(this.f31813b, org.telegram.ui.ActionBar.m6.uj, h6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f31813b.getText();
    }

    public void setTextColor(int i7) {
        this.f31813b.setTextColor(i7);
        w70 w70Var = this.f31814c;
        if (w70Var != null) {
            w70Var.setTextColor(i7);
        }
    }
}
