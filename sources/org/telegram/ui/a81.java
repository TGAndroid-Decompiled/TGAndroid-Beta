package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
public final class a81 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f36453a;
    public final org.telegram.ui.Components.y80 f36454b;
    public final org.telegram.ui.Components.y80 f36455c;
    public final nh.d d;
    public final nh.d f36456e;

    public a81(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f36453a = c6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.Components.y80 a2 = i7.j6.a(context, 15.0f, i10, true, c6Var);
        this.f36454b = a2;
        a2.setGravity(17);
        addView(a2, i7.f6.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.y80 a10 = i7.j6.a(context, 13.0f, i10, false, c6Var);
        this.f36455c = a10;
        a10.setGravity(17);
        addView(a10, i7.f6.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        this.d = o10;
        nh.d o11 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        this.f36456e = o11;
        linearLayout.addView(o10, i7.f6.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(o11, i7.f6.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, i7.f6.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f36453a;
        this.f36454b.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f36455c.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
