package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class xb extends za {
    public final l9 f40352a;
    public final x70 f40353b;
    public final x70 f40354c;

    public xb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i7 = org.telegram.ui.ActionBar.l6.vj;
        getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.l6.tj));
        l9 l9Var = new l9(context);
        this.f40352a = l9Var;
        addView(l9Var, c8.ha.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.l6.uj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        x70 x70Var = new x70(context, null);
        this.f40353b = x70Var;
        x70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.s6.U(x70Var, i7, g6Var);
        x70Var.setTextSize(1, 14.0f);
        x70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(x70Var);
        x70 x70Var2 = new x70(context, null);
        this.f40354c = x70Var2;
        x70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.s6.U(x70Var2, i7, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var2, i10, g6Var);
        x70Var2.setTypeface(Typeface.SANS_SERIF);
        x70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(x70Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f40353b.getText()) + ".\n" + ((Object) this.f40354c.getText());
    }
}
