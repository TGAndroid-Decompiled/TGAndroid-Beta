package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
public final class vb extends ta {
    public final u8 f31206a;
    public final p80 f31207b;
    public final p80 f31208c;
    public final LinearLayout d;

    public vb(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var);
        u8 u8Var = new u8(context, false);
        this.f31206a = u8Var;
        u8Var.setStyle(11);
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(18.0f));
        addView(u8Var, w7.b6.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            kg.t1 t1Var = new kg.t1(2, context, null);
            this.f31207b = t1Var;
            org.telegram.messenger.zs.i(t1Var);
            t1Var.setTypeface(Typeface.SANS_SERIF);
            t1Var.setTextSize(1, 15.0f);
            t1Var.setEllipsize(TextUtils.TruncateAt.END);
            t1Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
            t1Var.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            addView(t1Var, w7.b6.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, w7.b6.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            kg.t1 t1Var2 = new kg.t1(3, context, null);
            this.f31207b = t1Var2;
            org.telegram.messenger.zs.i(t1Var2);
            Typeface typeface = Typeface.SANS_SERIF;
            t1Var2.setTypeface(typeface);
            t1Var2.setTextSize(1, 14.0f);
            t1Var2.setTypeface(org.telegram.messenger.i0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            t1Var2.setEllipsize(truncateAt);
            t1Var2.setMaxLines(1);
            linearLayout.addView(t1Var2);
            p80 p80Var = new p80(context, null);
            this.f31208c = p80Var;
            p80Var.setTypeface(typeface);
            p80Var.setTextSize(1, 12.0f);
            p80Var.setEllipsize(truncateAt);
            p80Var.setSingleLine(false);
            p80Var.setMaxLines(3);
            org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.uj, p6Var);
            linearLayout.addView(p80Var, w7.b6.t(-2, -2, 0, 0, 0, 0, 0));
        }
        org.telegram.ui.ActionBar.a7.H(this.f31207b, org.telegram.ui.ActionBar.t6.uj, p6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f31207b.getText();
    }

    public void setTextColor(int i10) {
        this.f31207b.setTextColor(i10);
        p80 p80Var = this.f31208c;
        if (p80Var != null) {
            p80Var.setTextColor(i10);
        }
    }
}
