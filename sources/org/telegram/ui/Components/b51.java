package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class b51 extends org.telegram.ui.ActionBar.h2 {
    public bi.d6 f33530a;
    public kg.o1 f33531b;
    public int f33532c;
    public int d;

    public b51() {
        super(null);
        this.f33532c = -1;
    }

    public abstract void Z(ArrayList arrayList, z41 z41Var);

    public abstract CharSequence a0();

    public abstract void b0(l41 l41Var, View view);

    public abstract boolean c0(l41 l41Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 21);
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        if (a5Var != null) {
            a5Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(x7Var);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(x7Var);
        }
        this.f33531b = new kg.o1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29339a7, this.f33531b, null);
        }
        bi.d6 d6Var = new bi.d6(this, this, new d(this, 23), new a51(this), new a51(this));
        this.f33530a = d6Var;
        this.f33531b.addView(d6Var, c8.ma.c(-1.0f, -1));
        kg.o1 o1Var = this.f33531b;
        this.fragmentView = o1Var;
        return o1Var;
    }
}
