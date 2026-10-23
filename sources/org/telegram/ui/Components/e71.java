package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class e71 extends org.telegram.ui.ActionBar.o2 {
    public d71 f25907a;
    public int f25908b;
    public int f25909c;

    public e71() {
        super(null);
        this.f25908b = -1;
    }

    public abstract void U(ArrayList arrayList, b71 b71Var);

    public abstract CharSequence V();

    public abstract void W(m61 m61Var, View view);

    public abstract boolean X(m61 m61Var, View view);

    @Override
    public View createView(Context context) {
        i2.o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 16));
        ig.o1 o1Var = new ig.o1(context, null, 1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, o1Var, null);
        d71 d71Var = new d71(this, this, new d(this, 22), new c71(this), new c71(this));
        this.f25907a = d71Var;
        o1Var.addView(d71Var, w7.z5.c(-1.0f, -1));
        this.fragmentView = o1Var;
        return o1Var;
    }
}
