package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class ac extends db {
    public final p9 f33456a;
    public final j80 f33457b;
    public final j80 f33458c;

    public ac(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        p9 p9Var = new p9(context);
        this.f33456a = p9Var;
        addView(p9Var, c8.na.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.n6.xj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.na.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        j80 j80Var = new j80(context, null);
        this.f33457b = j80Var;
        j80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.U(j80Var, i7, i6Var);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(j80Var);
        j80 j80Var2 = new j80(context, null);
        this.f33458c = j80Var2;
        j80Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.U(j80Var2, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var2, i10, i6Var);
        j80Var2.setTypeface(Typeface.SANS_SERIF);
        j80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(j80Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f33457b.getText()) + ".\n" + ((Object) this.f33458c.getText());
    }
}
