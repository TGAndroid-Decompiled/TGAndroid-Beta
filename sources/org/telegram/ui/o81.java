package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
public final class o81 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f39656a;
    public final org.telegram.ui.Components.g90 f39657b;
    public final org.telegram.ui.Components.g90 f39658c;
    public final qh.d d;
    public final qh.d f39659e;

    public o81(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f39656a = g6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.g90 a2 = k7.g6.a(context, 15.0f, i10, true, g6Var);
        this.f39657b = a2;
        a2.setGravity(17);
        addView(a2, k7.c6.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.g90 a10 = k7.g6.a(context, 13.0f, i10, false, g6Var);
        this.f39658c = a10;
        a10.setGravity(17);
        addView(a10, k7.c6.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        this.d = p10;
        qh.d p11 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        this.f39659e = p11;
        linearLayout.addView(p10, k7.c6.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(p11, k7.c6.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, k7.c6.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f39656a;
        this.f39657b.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        this.f39658c.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
