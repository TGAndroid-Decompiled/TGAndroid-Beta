package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
public final class j91 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f39163a;
    public final org.telegram.ui.Components.ia0 f39164b;
    public final org.telegram.ui.Components.ia0 f39165c;
    public final ci.d d;
    public final ci.d f39166e;

    public j91(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f39163a = c6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.Components.ia0 a2 = w7.a6.a(context, 15.0f, i10, true, c6Var);
        this.f39164b = a2;
        a2.setGravity(17);
        addView(a2, w7.w5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.ia0 a10 = w7.a6.a(context, 13.0f, i10, false, c6Var);
        this.f39165c = a10;
        a10.setGravity(17);
        addView(a10, w7.w5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ci.d f7 = org.telegram.messenger.am.f(24, context, c6Var, true);
        this.d = f7;
        ci.d f10 = org.telegram.messenger.am.f(24, context, c6Var, true);
        this.f39166e = f10;
        linearLayout.addView(f7, w7.w5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(f10, w7.w5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.w5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f39163a;
        this.f39164b.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        this.f39165c.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
