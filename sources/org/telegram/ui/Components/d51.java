package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class d51 extends org.telegram.ui.ActionBar.g2 {
    public bi.i6 f34213a;
    public kg.o1 f34214b;
    public int f34215c;
    public int d;

    public d51() {
        super(null);
        this.f34215c = -1;
    }

    public abstract void Z(ArrayList arrayList, b51 b51Var);

    public abstract CharSequence a0();

    public abstract void b0(n41 n41Var, View view);

    public abstract boolean c0(n41 n41Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 21);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(y7Var);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(y7Var);
        }
        this.f34214b = new kg.o1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394a7, this.f34214b, null);
        }
        bi.i6 i6Var = new bi.i6(this, this, new d(this, 23), new c51(this), new c51(this));
        this.f34213a = i6Var;
        this.f34214b.addView(i6Var, c8.na.c(-1.0f, -1));
        kg.o1 o1Var = this.f34214b;
        this.fragmentView = o1Var;
        return o1Var;
    }
}
