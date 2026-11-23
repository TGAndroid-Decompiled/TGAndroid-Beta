package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class bc extends eb {
    public final q9 f33799a;
    public final m80 f33800b;
    public final m80 f33801c;

    public bc(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i7 = org.telegram.ui.ActionBar.m6.yj;
        getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.wj));
        q9 q9Var = new q9(context);
        this.f33799a = q9Var;
        addView(q9Var, c8.na.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.m6.xj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.na.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        m80 m80Var = new m80(context, null);
        this.f33800b = m80Var;
        m80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.U(m80Var, i7, h6Var);
        m80Var.setTextSize(1, 14.0f);
        m80Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(m80Var);
        m80 m80Var2 = new m80(context, null);
        this.f33801c = m80Var2;
        m80Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.U(m80Var2, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var2, i10, h6Var);
        m80Var2.setTypeface(Typeface.SANS_SERIF);
        m80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(m80Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f33800b.getText()) + ".\n" + ((Object) this.f33801c.getText());
    }
}
