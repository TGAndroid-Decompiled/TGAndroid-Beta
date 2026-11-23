package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
public final class ec extends db {
    public final d9 f34685a;
    public final j80 f34686b;
    public final j80 f34687c;
    public final LinearLayout d;

    public ec(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var);
        d9 d9Var = new d9(context, false);
        this.f34685a = d9Var;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(d9Var, c8.na.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            bi.w2 w2Var = new bi.w2(4, context, null);
            this.f34686b = w2Var;
            org.telegram.messenger.ks.i(w2Var);
            w2Var.setTypeface(Typeface.SANS_SERIF);
            w2Var.setTextSize(1, 15.0f);
            w2Var.setEllipsize(TextUtils.TruncateAt.END);
            w2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            w2Var.setGravity(org.telegram.messenger.gd.f24314a0 ? 5 : 3);
            addView(w2Var, c8.na.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, c8.na.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            bi.w2 w2Var2 = new bi.w2(5, context, null);
            this.f34686b = w2Var2;
            org.telegram.messenger.ks.i(w2Var2);
            Typeface typeface = Typeface.SANS_SERIF;
            w2Var2.setTypeface(typeface);
            w2Var2.setTextSize(1, 14.0f);
            w2Var2.setTypeface(org.telegram.messenger.g0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            w2Var2.setEllipsize(truncateAt);
            w2Var2.setMaxLines(1);
            linearLayout.addView(w2Var2);
            j80 j80Var = new j80(context, null);
            this.f34687c = j80Var;
            j80Var.setTypeface(typeface);
            j80Var.setTextSize(1, 12.0f);
            j80Var.setEllipsize(truncateAt);
            j80Var.setSingleLine(false);
            j80Var.setMaxLines(3);
            org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.xj, i6Var);
            linearLayout.addView(j80Var, c8.na.t(-2, -2, 0, 0, 0, 0, 0));
        }
        org.telegram.ui.ActionBar.u6.G(this.f34686b, org.telegram.ui.ActionBar.n6.xj, i6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f34686b.getText();
    }

    public void setTextColor(int i7) {
        this.f34686b.setTextColor(i7);
        j80 j80Var = this.f34687c;
        if (j80Var != null) {
            j80Var.setTextColor(i7);
        }
    }
}
