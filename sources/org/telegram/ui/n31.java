package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class n31 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f50078a;
    public final org.telegram.ui.Components.m80 f50079b;
    public final org.telegram.ui.Components.m80 f50080c;
    public final hi.e d;
    public final hi.e f50081e;

    public n31(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f50078a = h6Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.Components.m80 a10 = c8.va.a(context, 15.0f, i7, true, h6Var);
        this.f50079b = a10;
        a10.setGravity(17);
        addView(a10, c8.ma.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.m80 a11 = c8.va.a(context, 13.0f, i7, false, h6Var);
        this.f50080c = a11;
        a11.setGravity(17);
        addView(a11, c8.ma.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        hi.e g10 = org.telegram.messenger.n10.g(24, context, h6Var, true);
        this.d = g10;
        hi.e g11 = org.telegram.messenger.n10.g(24, context, h6Var, true);
        this.f50081e = g11;
        linearLayout.addView(g10, c8.ma.q(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(g11, c8.ma.q(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, c8.ma.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f50078a;
        this.f50079b.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.f50080c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
    }
}
