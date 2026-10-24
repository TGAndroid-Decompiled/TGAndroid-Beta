package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class d71 extends org.telegram.ui.ActionBar.o2 {
    public c71 f25615a;
    public int f25616b;
    public int f25617c;

    public d71() {
        super(null);
        this.f25616b = -1;
    }

    public abstract void U(ArrayList arrayList, a71 a71Var);

    public abstract CharSequence V();

    public abstract void W(l61 l61Var, View view);

    public abstract boolean X(l61 l61Var, View view);

    @Override
    public View createView(Context context) {
        i2.o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 16));
        ig.o1 o1Var = new ig.o1(context, null, 1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, o1Var, null);
        c71 c71Var = new c71(this, this, new d(this, 22), new b71(this), new b71(this));
        this.f25615a = c71Var;
        o1Var.addView(c71Var, w7.z5.c(-1.0f, -1));
        this.fragmentView = o1Var;
        return o1Var;
    }
}
