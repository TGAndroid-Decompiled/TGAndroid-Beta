package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class m31 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f49945a;
    public final org.telegram.ui.Components.j80 f49946b;
    public final org.telegram.ui.Components.j80 f49947c;
    public final hi.e d;
    public final hi.e f49948e;

    public m31(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f49945a = i6Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.Components.j80 a10 = c8.wa.a(context, 15.0f, i7, true, i6Var);
        this.f49946b = a10;
        a10.setGravity(17);
        addView(a10, c8.na.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.j80 a11 = c8.wa.a(context, 13.0f, i7, false, i6Var);
        this.f49947c = a11;
        a11.setGravity(17);
        addView(a11, c8.na.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        hi.e g10 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        this.d = g10;
        hi.e g11 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        this.f49948e = g11;
        linearLayout.addView(g10, c8.na.q(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(g11, c8.na.q(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, c8.na.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f49945a;
        this.f49946b.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.f49947c.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
    }
}
