package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class rb extends ta {
    public final g9 f29970a;
    public final p80 f29971b;
    public final p80 f29972c;

    public rb(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        int i10 = org.telegram.ui.ActionBar.t6.vj;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
        g9 g9Var = new g9(context);
        this.f29970a = g9Var;
        addView(g9Var, w7.b6.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.t6.uj;
        getThemedColor(i11);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p80 p80Var = new p80(context, null);
        this.f29971b = p80Var;
        p80Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        org.telegram.ui.ActionBar.a7.V(p80Var, i10, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        linearLayout.addView(p80Var);
        p80 p80Var2 = new p80(context, null);
        this.f29972c = p80Var2;
        p80Var2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        org.telegram.ui.ActionBar.a7.V(p80Var2, i10, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var2, i11, p6Var);
        p80Var2.setTypeface(Typeface.SANS_SERIF);
        p80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(p80Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f29971b.getText()) + ".\n" + ((Object) this.f29972c.getText());
    }
}
