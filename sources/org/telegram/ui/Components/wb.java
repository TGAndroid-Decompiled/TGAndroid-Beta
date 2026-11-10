package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class wb extends ya {
    public final k9 f39937a;
    public final w70 f39938b;
    public final w70 f39939c;

    public wb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i7 = org.telegram.ui.ActionBar.m6.vj;
        getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
        k9 k9Var = new k9(context);
        this.f39937a = k9Var;
        addView(k9Var, c8.ha.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.m6.uj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        w70 w70Var = new w70(context, null);
        this.f39938b = w70Var;
        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.U(w70Var, i7, h6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(w70Var);
        w70 w70Var2 = new w70(context, null);
        this.f39939c = w70Var2;
        w70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.U(w70Var2, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var2, i10, h6Var);
        w70Var2.setTypeface(Typeface.SANS_SERIF);
        w70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(w70Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f39938b.getText()) + ".\n" + ((Object) this.f39939c.getText());
    }
}
