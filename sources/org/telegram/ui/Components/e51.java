package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class e51 extends org.telegram.ui.ActionBar.g2 {
    public bi.i6 f34671a;
    public kg.o1 f34672b;
    public int f34673c;
    public int d;

    public e51() {
        super(null);
        this.f34673c = -1;
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
        this.f34672b = new kg.o1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29290a7, this.f34672b, null);
        }
        bi.i6 i6Var = new bi.i6(this, this, new d(this, 23), new d51(this), new d51(this));
        this.f34671a = i6Var;
        this.f34672b.addView(i6Var, c8.na.c(-1.0f, -1));
        kg.o1 o1Var = this.f34672b;
        this.fragmentView = o1Var;
        return o1Var;
    }
}
