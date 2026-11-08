package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class xb extends za {
    public final l9 f40282a;
    public final w70 f40283b;
    public final w70 f40284c;

    public xb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i7 = org.telegram.ui.ActionBar.k6.vj;
        getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        l9 l9Var = new l9(context);
        this.f40282a = l9Var;
        addView(l9Var, c8.ha.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.k6.uj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        w70 w70Var = new w70(context, null);
        this.f40283b = w70Var;
        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(w70Var, i7, f6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(w70Var);
        w70 w70Var2 = new w70(context, null);
        this.f40284c = w70Var2;
        w70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(w70Var2, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var2, i10, f6Var);
        w70Var2.setTypeface(Typeface.SANS_SERIF);
        w70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(w70Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f40283b.getText()) + ".\n" + ((Object) this.f40284c.getText());
    }
}
