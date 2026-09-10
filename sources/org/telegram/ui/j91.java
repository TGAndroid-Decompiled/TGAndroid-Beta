package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
public final class j91 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f34060a;
    public final org.telegram.ui.Components.m90 f34061b;
    public final org.telegram.ui.Components.m90 f34062c;
    public final bi.d d;
    public final bi.d e;

    public j91(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f34060a = f6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.m90 a2 = w7.e6.a(context, 15.0f, i10, true, f6Var);
        this.f34061b = a2;
        a2.setGravity(17);
        addView(a2, w7.a6.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.m90 a10 = w7.e6.a(context, 13.0f, i10, false, f6Var);
        this.f34062c = a10;
        a10.setGravity(17);
        addView(a10, w7.a6.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        bi.d g10 = org.telegram.messenger.em.g(24, context, f6Var, true);
        this.d = g10;
        bi.d g11 = org.telegram.messenger.em.g(24, context, f6Var, true);
        this.e = g11;
        linearLayout.addView(g10, w7.a6.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(g11, w7.a6.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.a6.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f34060a;
        this.f34061b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f34062c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
