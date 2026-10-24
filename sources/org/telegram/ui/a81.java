package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class a81 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f35674a;
    public final org.telegram.ui.Components.w90 f35675b;
    public final org.telegram.ui.Components.w90 f35676c;
    public final ei.d d;
    public final ei.d e;

    public a81(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f35674a = g6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.w90 a2 = w7.d6.a(context, 15.0f, i10, true, g6Var);
        this.f35675b = a2;
        a2.setGravity(17);
        addView(a2, w7.z5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.w90 a10 = w7.d6.a(context, 13.0f, i10, false, g6Var);
        this.f35676c = a10;
        a10.setGravity(17);
        addView(a10, w7.z5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ei.d g10 = org.telegram.messenger.tl.g(24, context, g6Var, true);
        this.d = g10;
        ei.d g11 = org.telegram.messenger.tl.g(24, context, g6Var, true);
        this.e = g11;
        linearLayout.addView(g10, w7.z5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(g11, w7.z5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.z5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f35674a;
        this.f35675b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.f35676c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
    }
}
