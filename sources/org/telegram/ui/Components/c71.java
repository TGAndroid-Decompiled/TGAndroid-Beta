package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class c71 extends org.telegram.ui.ActionBar.m2 {
    public b71 f23964a;
    public int f23965b;
    public int f23966c;

    public c71() {
        super(null);
        this.f23965b = -1;
    }

    public abstract void U(ArrayList arrayList, z61 z61Var);

    public abstract CharSequence V();

    public abstract void W(l61 l61Var, View view);

    public abstract boolean X(l61 l61Var, View view);

    @Override
    public View createView(Context context) {
        i2.d.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.nb(this, 15));
        ig.q1 q1Var = new ig.q1(context, null, 1);
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        b71 b71Var = new b71(this, this, new d(this, 22), new a71(this), new a71(this));
        this.f23964a = b71Var;
        q1Var.addView(b71Var, w7.a6.d(-1.0f, -1));
        this.fragmentView = q1Var;
        return q1Var;
    }
}
