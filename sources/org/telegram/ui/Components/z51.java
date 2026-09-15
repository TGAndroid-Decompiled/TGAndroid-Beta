package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class z51 extends org.telegram.ui.ActionBar.n2 {
    public y51 f30485a;
    public hg.q1 f30486b;
    public int f30487c;
    public int d;

    public z51() {
        super(null);
        this.f30487c = -1;
    }

    public abstract void U(ArrayList arrayList, w51 w51Var);

    public abstract CharSequence V();

    public abstract void W(i51 i51Var, View view);

    public abstract boolean X(i51 i51Var, View view);

    @Override
    public View createView(Context context) {
        hg.k0.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.to(this, 13));
        hg.q1 q1Var = new hg.q1(context, null, 1);
        this.f30486b = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false));
        y51 y51Var = new y51(this, this, new d(this, 22), new x51(this), new x51(this));
        this.f30485a = y51Var;
        this.f30486b.addView(y51Var, w7.x5.c(-1.0f, -1));
        hg.q1 q1Var2 = this.f30486b;
        this.fragmentView = q1Var2;
        return q1Var2;
    }
}
