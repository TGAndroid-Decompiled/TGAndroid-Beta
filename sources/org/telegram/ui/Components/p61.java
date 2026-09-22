package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class p61 extends org.telegram.ui.ActionBar.n2 {
    public o61 f27268a;
    public hg.q1 f27269b;
    public int f27270c;
    public int d;

    public p61() {
        super(null);
        this.f27270c = -1;
    }

    public abstract void U(ArrayList arrayList, m61 m61Var);

    public abstract CharSequence V();

    public abstract void W(y51 y51Var, View view);

    public abstract boolean X(y51 y51Var, View view);

    @Override
    public View createView(Context context) {
        hg.k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 13));
        hg.q1 q1Var = new hg.q1(context, null, 1);
        this.f27269b = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19053a7, false));
        o61 o61Var = new o61(this, this, new d(this, 22), new n61(this), new n61(this));
        this.f27268a = o61Var;
        this.f27269b.addView(o61Var, w7.y5.c(-1.0f, -1));
        hg.q1 q1Var2 = this.f27269b;
        this.fragmentView = q1Var2;
        return q1Var2;
    }
}
