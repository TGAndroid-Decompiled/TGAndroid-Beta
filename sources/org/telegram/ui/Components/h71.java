package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class h71 extends org.telegram.ui.ActionBar.m2 {
    public g71 f26922a;
    public int f26923b;
    public int f26924c;

    public h71() {
        super(null);
        this.f26923b = -1;
    }

    public abstract void U(ArrayList arrayList, e71 e71Var);

    public abstract CharSequence V();

    public abstract void W(r61 r61Var, View view);

    public abstract boolean X(r61 r61Var, View view);

    @Override
    public View createView(Context context) {
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 13));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
        g71 g71Var = new g71(this, this, new d(this, 22), new f71(this), new f71(this));
        this.f26922a = g71Var;
        r1Var.addView(g71Var, w7.x5.d(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
