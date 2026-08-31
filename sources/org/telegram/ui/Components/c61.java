package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class c61 extends org.telegram.ui.ActionBar.p2 {
    public b61 f25815a;
    public int f25816b;
    public int f25817c;

    public c61() {
        super(null);
        this.f25816b = -1;
    }

    public abstract void U(ArrayList arrayList, x51 x51Var);

    public abstract CharSequence V();

    public abstract void W(j51 j51Var, View view);

    public abstract boolean X(j51 j51Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new z51(this, 0));
        a61 a61Var = new a61(context, null, 0);
        a61Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        b61 b61Var = new b61(this, this, new d(this, 22), new y51(this), new y51(this));
        this.f25815a = b61Var;
        a61Var.addView(b61Var, k7.c6.c(-1.0f, -1));
        this.fragmentView = a61Var;
        return a61Var;
    }
}
