package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
public final class h91 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f38236a;
    public final org.telegram.ui.Components.ea0 f38237b;
    public final org.telegram.ui.Components.ea0 f38238c;
    public final ci.d d;
    public final ci.d f38239e;

    public h91(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f38236a = e6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.Components.ea0 a2 = w7.b6.a(context, 15.0f, i10, true, e6Var);
        this.f38237b = a2;
        a2.setGravity(17);
        addView(a2, w7.x5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.ea0 a10 = w7.b6.a(context, 13.0f, i10, false, e6Var);
        this.f38238c = a10;
        a10.setGravity(17);
        addView(a10, w7.x5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ci.d f7 = org.telegram.messenger.bi.f(24, context, e6Var, true);
        this.d = f7;
        ci.d f10 = org.telegram.messenger.bi.f(24, context, e6Var, true);
        this.f38239e = f10;
        linearLayout.addView(f7, w7.x5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(f10, w7.x5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.x5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f38236a;
        this.f38237b.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        this.f38238c.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
