package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class z51 extends org.telegram.ui.ActionBar.n2 {
    public y51 f30482a;
    public int f30483b;
    public int f30484c;

    public z51() {
        super(null);
        this.f30483b = -1;
    }

    public abstract void U(ArrayList arrayList, w51 w51Var);

    public abstract CharSequence V();

    public abstract void W(i51 i51Var, View view);

    public abstract boolean X(i51 i51Var, View view);

    @Override
    public View createView(Context context) {
        hg.c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.to(this, 13));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18778a7, false));
        y51 y51Var = new y51(this, this, new d(this, 22), new x51(this), new x51(this));
        this.f30482a = y51Var;
        r1Var.addView(y51Var, w7.x5.c(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
