package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class a61 extends org.telegram.ui.ActionBar.o2 {
    public z51 f22336a;
    public hg.q1 f22337b;
    public int f22338c;
    public int d;

    public a61() {
        super(null);
        this.f22338c = -1;
    }

    public abstract void U(ArrayList arrayList, x51 x51Var);

    public abstract CharSequence V();

    public abstract void W(j51 j51Var, View view);

    public abstract boolean X(j51 j51Var, View view);

    @Override
    public View createView(Context context) {
        hg.k0.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.to(this, 13));
        hg.q1 q1Var = new hg.q1(context, null, 1);
        this.f22337b = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18807a7, false));
        z51 z51Var = new z51(this, this, new d(this, 22), new y51(this), new y51(this));
        this.f22336a = z51Var;
        this.f22337b.addView(z51Var, w7.x5.c(-1.0f, -1));
        hg.q1 q1Var2 = this.f22337b;
        this.fragmentView = q1Var2;
        return q1Var2;
    }
}
