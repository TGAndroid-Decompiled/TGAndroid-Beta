package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
public final class e91 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f33234a;
    public final org.telegram.ui.Components.c90 f33235b;
    public final org.telegram.ui.Components.c90 f33236c;
    public final ci.d d;
    public final ci.d e;

    public e91(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f33234a = e6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.Components.c90 a2 = w7.b6.a(context, 15.0f, i10, true, e6Var);
        this.f33235b = a2;
        a2.setGravity(17);
        addView(a2, w7.x5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.c90 a10 = w7.b6.a(context, 13.0f, i10, false, e6Var);
        this.f33236c = a10;
        a10.setGravity(17);
        addView(a10, w7.x5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ci.d g10 = org.telegram.messenger.vl.g(24, context, e6Var, true);
        this.d = g10;
        ci.d g11 = org.telegram.messenger.vl.g(24, context, e6Var, true);
        this.e = g11;
        linearLayout.addView(g10, w7.x5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(g11, w7.x5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.x5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33234a;
        this.f33235b.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        this.f33236c.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
