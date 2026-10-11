package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
public final class g91 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f38028a;
    public final org.telegram.ui.Components.ea0 f38029b;
    public final org.telegram.ui.Components.ea0 f38030c;
    public final ci.d d;
    public final ci.d f38031e;

    public g91(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f38028a = d6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.Components.ea0 a2 = w7.b6.a(context, 15.0f, i10, true, d6Var);
        this.f38029b = a2;
        a2.setGravity(17);
        addView(a2, w7.x5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.ea0 a10 = w7.b6.a(context, 13.0f, i10, false, d6Var);
        this.f38030c = a10;
        a10.setGravity(17);
        addView(a10, w7.x5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ci.d f7 = org.telegram.messenger.ai.f(24, context, d6Var, true);
        this.d = f7;
        ci.d f10 = org.telegram.messenger.ai.f(24, context, d6Var, true);
        this.f38031e = f10;
        linearLayout.addView(f7, w7.x5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(f10, w7.x5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.x5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f38028a;
        this.f38029b.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        this.f38030c.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
