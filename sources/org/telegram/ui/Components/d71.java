package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class d71 extends org.telegram.ui.ActionBar.m2 {
    public c71 f24003a;
    public int f24004b;
    public int f24005c;

    public d71() {
        super(null);
        this.f24004b = -1;
    }

    public abstract void U(ArrayList arrayList, a71 a71Var);

    public abstract CharSequence V();

    public abstract void W(m61 m61Var, View view);

    public abstract boolean X(m61 m61Var, View view);

    @Override
    public View createView(Context context) {
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.nb(this, 15));
        ig.q1 q1Var = new ig.q1(context, null, 1);
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        c71 c71Var = new c71(this, this, new d(this, 22), new b71(this), new b71(this));
        this.f24003a = c71Var;
        q1Var.addView(c71Var, w7.z5.d(-1.0f, -1));
        this.fragmentView = q1Var;
        return q1Var;
    }
}
