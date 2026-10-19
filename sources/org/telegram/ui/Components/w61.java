package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class w61 extends org.telegram.ui.ActionBar.n2 {
    public v61 f32025a;
    public int f32026b;
    public int f32027c;

    public w61() {
        super(null);
        this.f32026b = -1;
    }

    public abstract void U(ArrayList arrayList, t61 t61Var);

    public abstract CharSequence V();

    public abstract void W(g61 g61Var, View view);

    public abstract boolean X(g61 g61Var, View view);

    @Override
    public View createView(Context context) {
        i2.e.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 16));
        ig.p1 p1Var = new ig.p1(context, null, 1);
        p1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20929a7, false));
        v61 v61Var = new v61(this, this, new d(this, 22), new u61(this), new u61(this));
        this.f32025a = v61Var;
        p1Var.addView(v61Var, w7.z5.c(-1.0f, -1));
        this.fragmentView = p1Var;
        return p1Var;
    }
}
