package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class o61 extends org.telegram.ui.ActionBar.n2 {
    public n61 f26891a;
    public hg.q1 f26892b;
    public int f26893c;
    public int d;

    public o61() {
        super(null);
        this.f26893c = -1;
    }

    public abstract void U(ArrayList arrayList, l61 l61Var);

    public abstract CharSequence V();

    public abstract void W(x51 x51Var, View view);

    public abstract boolean X(x51 x51Var, View view);

    @Override
    public View createView(Context context) {
        hg.k0.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 13));
        hg.q1 q1Var = new hg.q1(context, null, 1);
        this.f26892b = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19006a7, false));
        n61 n61Var = new n61(this, this, new d(this, 22), new m61(this), new m61(this));
        this.f26891a = n61Var;
        this.f26892b.addView(n61Var, w7.y5.c(-1.0f, -1));
        hg.q1 q1Var2 = this.f26892b;
        this.fragmentView = q1Var2;
        return q1Var2;
    }
}
