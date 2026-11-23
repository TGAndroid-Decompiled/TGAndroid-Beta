package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
public final class fc extends eb {
    public final e9 f35200a;
    public final m80 f35201b;
    public final m80 f35202c;
    public final LinearLayout d;

    public fc(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context, h6Var);
        e9 e9Var = new e9(context, false);
        this.f35200a = e9Var;
        e9Var.setStyle(11);
        e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(e9Var, c8.ma.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z10) {
            bi.u2 u2Var = new bi.u2(4, context, null);
            this.f35201b = u2Var;
            org.telegram.messenger.ls.i(u2Var);
            u2Var.setTypeface(Typeface.SANS_SERIF);
            u2Var.setTextSize(1, 15.0f);
            u2Var.setEllipsize(TextUtils.TruncateAt.END);
            u2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            u2Var.setGravity(org.telegram.messenger.hd.f24444a0 ? 5 : 3);
            addView(u2Var, c8.ma.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, c8.ma.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            bi.u2 u2Var2 = new bi.u2(5, context, null);
            this.f35201b = u2Var2;
            org.telegram.messenger.ls.i(u2Var2);
            Typeface typeface = Typeface.SANS_SERIF;
            u2Var2.setTypeface(typeface);
            u2Var2.setTextSize(1, 14.0f);
            u2Var2.setTypeface(org.telegram.messenger.g0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            u2Var2.setEllipsize(truncateAt);
            u2Var2.setMaxLines(1);
            linearLayout.addView(u2Var2);
            m80 m80Var = new m80(context, null);
            this.f35202c = m80Var;
            m80Var.setTypeface(typeface);
            m80Var.setTextSize(1, 12.0f);
            m80Var.setEllipsize(truncateAt);
            m80Var.setSingleLine(false);
            m80Var.setMaxLines(3);
            org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.xj, h6Var);
            linearLayout.addView(m80Var, c8.ma.t(-2, -2, 0, 0, 0, 0, 0));
        }
        org.telegram.ui.ActionBar.t6.G(this.f35201b, org.telegram.ui.ActionBar.m6.xj, h6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.wj));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f35201b.getText();
    }

    public void setTextColor(int i7) {
        this.f35201b.setTextColor(i7);
        m80 m80Var = this.f35202c;
        if (m80Var != null) {
            m80Var.setTextColor(i7);
        }
    }
}
