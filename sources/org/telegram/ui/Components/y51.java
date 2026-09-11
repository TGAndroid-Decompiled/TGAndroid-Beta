package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class y51 extends org.telegram.ui.ActionBar.n2 {
    public x51 f32849a;
    public int f32850b;
    public int f32851c;

    public y51() {
        super(null);
        this.f32850b = -1;
    }

    public abstract void U(ArrayList arrayList, v51 v51Var);

    public abstract CharSequence V();

    public abstract void W(h51 h51Var, View view);

    public abstract boolean X(h51 h51Var, View view);

    @Override
    public View createView(Context context) {
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ic(this, 14));
        ig.q1 q1Var = new ig.q1(context, null, 1);
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        x51 x51Var = new x51(this, this, new d(this, 22), new w51(this), new w51(this));
        this.f32849a = x51Var;
        q1Var.addView(x51Var, w7.x5.c(-1.0f, -1));
        this.fragmentView = q1Var;
        return q1Var;
    }
}
