package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class vb extends ya {
    public final k9 f39058a;
    public final s70 f39059b;
    public final s70 f39060c;

    public vb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i3 = org.telegram.ui.ActionBar.k6.vj;
        getThemedColor(i3);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        k9 k9Var = new k9(context);
        this.f39058a = k9Var;
        addView(k9Var, b8.mf.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i3);
        int i10 = org.telegram.ui.ActionBar.k6.uj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        s70 s70Var = new s70(context, null);
        this.f39059b = s70Var;
        s70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(s70Var, i3, e6Var);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(s70Var);
        s70 s70Var2 = new s70(context, null);
        this.f39060c = s70Var2;
        s70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(s70Var2, i3, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var2, i10, e6Var);
        s70Var2.setTypeface(Typeface.SANS_SERIF);
        s70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(s70Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f39059b.getText()) + ".\n" + ((Object) this.f39060c.getText());
    }
}
