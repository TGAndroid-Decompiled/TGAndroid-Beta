package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class o61 extends org.telegram.ui.ActionBar.o2 {
    public n61 f27008a;
    public hg.q1 f27009b;
    public int f27010c;
    public int d;

    public o61() {
        super(null);
        this.f27010c = -1;
    }

    public abstract void U(ArrayList arrayList, l61 l61Var);

    public abstract CharSequence V();

    public abstract void W(x51 x51Var, View view);

    public abstract boolean X(x51 x51Var, View view);

    @Override
    public View createView(Context context) {
        hg.k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.po(this, 13));
        hg.q1 q1Var = new hg.q1(context, null, 1);
        this.f27009b = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
        n61 n61Var = new n61(this, this, new d(this, 22), new m61(this), new m61(this));
        this.f27008a = n61Var;
        this.f27009b.addView(n61Var, w7.y5.c(-1.0f, -1));
        hg.q1 q1Var2 = this.f27009b;
        this.fragmentView = q1Var2;
        return q1Var2;
    }
}
