package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class d51 extends org.telegram.ui.ActionBar.o2 {
    public c51 f27658a;
    public int f27659b;
    public int f27660c;

    public d51() {
        super(null);
        this.f27659b = -1;
    }

    public abstract void T(ArrayList arrayList, z41 z41Var);

    public abstract CharSequence U();

    public abstract void V(l41 l41Var, View view);

    public abstract boolean W(l41 l41Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(U());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 8));
        b51 b51Var = new b51(context, null, 0);
        b51Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        c51 c51Var = new c51(this, this, new d(this, 22), new a51(this), new a51(this));
        this.f27658a = c51Var;
        b51Var.addView(c51Var, g7.e6.c(-1.0f, -1));
        this.fragmentView = b51Var;
        return b51Var;
    }
}
