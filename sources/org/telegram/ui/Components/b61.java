package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class b61 extends org.telegram.ui.ActionBar.p2 {
    public a61 f25523a;
    public int f25524b;
    public int f25525c;

    public b61() {
        super(null);
        this.f25524b = -1;
    }

    public abstract void U(ArrayList arrayList, w51 w51Var);

    public abstract CharSequence V();

    public abstract void W(h51 h51Var, View view);

    public abstract boolean X(h51 h51Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new y51(this, 0));
        z51 z51Var = new z51(context, null, 0);
        z51Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        a61 a61Var = new a61(this, this, new d(this, 22), new x51(this), new x51(this));
        this.f25523a = a61Var;
        z51Var.addView(a61Var, k7.c6.c(-1.0f, -1));
        this.fragmentView = z51Var;
        return z51Var;
    }
}
