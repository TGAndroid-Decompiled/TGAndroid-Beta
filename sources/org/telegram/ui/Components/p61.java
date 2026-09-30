package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class p61 extends org.telegram.ui.ActionBar.m2 {
    public o61 f27258a;
    public int f27259b;
    public int f27260c;

    public p61() {
        super(null);
        this.f27259b = -1;
    }

    public abstract void U(ArrayList arrayList, m61 m61Var);

    public abstract CharSequence V();

    public abstract void W(y51 y51Var, View view);

    public abstract boolean X(y51 y51Var, View view);

    @Override
    public View createView(Context context) {
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.oo(this, 13));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19020a7, false));
        o61 o61Var = new o61(this, this, new d(this, 22), new n61(this), new n61(this));
        this.f27258a = o61Var;
        r1Var.addView(o61Var, w7.y5.c(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
