package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class l31 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f47401a;
    public final org.telegram.ui.Components.w70 f47402b;
    public final org.telegram.ui.Components.w70 f47403c;
    public final fi.d d;
    public final fi.d f47404e;

    public l31(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f47401a = f6Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.w70 a10 = c8.na.a(context, 15.0f, i7, true, f6Var);
        this.f47402b = a10;
        a10.setGravity(17);
        addView(a10, c8.ha.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.w70 a11 = c8.na.a(context, 13.0f, i7, false, f6Var);
        this.f47403c = a11;
        a11.setGravity(17);
        addView(a11, c8.ha.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.d = h;
        fi.d h7 = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.f47404e = h7;
        linearLayout.addView(h, c8.ha.q(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(h7, c8.ha.q(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, c8.ha.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f47401a;
        this.f47402b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.f47403c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
    }
}
