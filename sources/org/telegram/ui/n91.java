package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
public final class n91 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f38624a;
    public final org.telegram.ui.Components.da0 f38625b;
    public final org.telegram.ui.Components.da0 f38626c;
    public final di.d d;
    public final di.d e;

    public n91(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f38624a = c6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.Components.da0 a2 = w7.e6.a(context, 15.0f, i10, true, c6Var);
        this.f38625b = a2;
        a2.setGravity(17);
        addView(a2, w7.a6.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.da0 a10 = w7.e6.a(context, 13.0f, i10, false, c6Var);
        this.f38626c = a10;
        a10.setGravity(17);
        addView(a10, w7.a6.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        di.d f7 = org.telegram.messenger.yh.f(24, context, c6Var, true);
        this.d = f7;
        di.d f10 = org.telegram.messenger.yh.f(24, context, c6Var, true);
        this.e = f10;
        linearLayout.addView(f7, w7.a6.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(f10, w7.a6.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.a6.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38624a;
        this.f38625b.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.f38626c.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
