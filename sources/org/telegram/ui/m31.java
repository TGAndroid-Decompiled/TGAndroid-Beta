package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class m31 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f47735a;
    public final org.telegram.ui.Components.x70 f47736b;
    public final org.telegram.ui.Components.x70 f47737c;
    public final fi.d d;
    public final fi.d f47738e;

    public m31(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f47735a = g6Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.Components.x70 a10 = c8.qa.a(context, 15.0f, i7, true, g6Var);
        this.f47736b = a10;
        a10.setGravity(17);
        addView(a10, c8.ha.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.x70 a11 = c8.qa.a(context, 13.0f, i7, false, g6Var);
        this.f47737c = a11;
        a11.setGravity(17);
        addView(a11, c8.ha.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        fi.d h = org.telegram.messenger.k5.h(24, context, g6Var, true);
        this.d = h;
        fi.d h7 = org.telegram.messenger.k5.h(24, context, g6Var, true);
        this.f47738e = h7;
        linearLayout.addView(h, c8.ha.q(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(h7, c8.ha.q(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, c8.ha.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f47735a;
        this.f47736b.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        this.f47737c.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
    }
}
