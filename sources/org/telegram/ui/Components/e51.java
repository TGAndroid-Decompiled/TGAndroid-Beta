package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class e51 extends org.telegram.ui.ActionBar.g2 {
    public bi.f6 f34681a;
    public kg.n1 f34682b;
    public int f34683c;
    public int d;

    public e51() {
        super(null);
        this.f34683c = -1;
    }

    public abstract void Z(ArrayList arrayList, c51 c51Var);

    public abstract CharSequence a0();

    public abstract void b0(o41 o41Var, View view);

    public abstract boolean c0(o41 o41Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 21);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(x7Var);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(x7Var);
        }
        this.f34682b = new kg.n1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29324a7, this.f34682b, null);
        }
        bi.f6 f6Var = new bi.f6(this, this, new d(this, 23), new d51(this), new d51(this));
        this.f34681a = f6Var;
        this.f34682b.addView(f6Var, c8.ma.c(-1.0f, -1));
        kg.n1 n1Var = this.f34682b;
        this.fragmentView = n1Var;
        return n1Var;
    }
}
