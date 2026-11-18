package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class bc extends eb {
    public final q9 f33650a;
    public final k80 f33651b;
    public final k80 f33652c;

    public bc(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        q9 q9Var = new q9(context);
        this.f33650a = q9Var;
        addView(q9Var, c8.ma.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.n6.xj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        k80 k80Var = new k80(context, null);
        this.f33651b = k80Var;
        k80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.U(k80Var, i7, i6Var);
        k80Var.setTextSize(1, 14.0f);
        k80Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(k80Var);
        k80 k80Var2 = new k80(context, null);
        this.f33652c = k80Var2;
        k80Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.U(k80Var2, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var2, i10, i6Var);
        k80Var2.setTypeface(Typeface.SANS_SERIF);
        k80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(k80Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f33651b.getText()) + ".\n" + ((Object) this.f33652c.getText());
    }
}
