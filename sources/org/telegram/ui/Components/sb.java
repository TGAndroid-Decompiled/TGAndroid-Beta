package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class sb extends va {
    public final i9 f39267a;
    public final z70 f39268b;
    public final z70 f39269c;

    public sb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i7 = org.telegram.ui.ActionBar.j6.yj;
        getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
        i9 i9Var = new i9(context);
        this.f39267a = i9Var;
        addView(i9Var, c8.ja.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.j6.xj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ja.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        z70 z70Var = new z70(context, null);
        this.f39268b = z70Var;
        z70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.q6.U(z70Var, i7, e6Var);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(z70Var);
        z70 z70Var2 = new z70(context, null);
        this.f39269c = z70Var2;
        z70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.q6.U(z70Var2, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var2, i10, e6Var);
        z70Var2.setTypeface(Typeface.SANS_SERIF);
        z70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(z70Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f39268b.getText()) + ".\n" + ((Object) this.f39269c.getText());
    }
}
