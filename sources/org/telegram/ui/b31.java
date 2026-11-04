package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class b31 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f43909a;
    public final org.telegram.ui.Components.s70 f43910b;
    public final org.telegram.ui.Components.s70 f43911c;
    public final gi.d d;
    public final gi.d f43912e;

    public b31(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f43909a = e6Var;
        setOrientation(1);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.s70 a10 = b8.rf.a(context, 15.0f, i3, true, e6Var);
        this.f43910b = a10;
        a10.setGravity(17);
        addView(a10, b8.mf.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.s70 a11 = b8.rf.a(context, 13.0f, i3, false, e6Var);
        this.f43911c = a11;
        a11.setGravity(17);
        addView(a11, b8.mf.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.d = h;
        gi.d h7 = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.f43912e = h7;
        linearLayout.addView(h, b8.mf.q(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(h7, b8.mf.q(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, b8.mf.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f43909a;
        this.f43910b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.f43911c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
    }
}
