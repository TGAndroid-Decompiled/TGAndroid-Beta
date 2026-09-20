package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class n61 extends org.telegram.ui.ActionBar.n2 {
    public m61 f26598a;
    public hg.q1 f26599b;
    public int f26600c;
    public int d;

    public n61() {
        super(null);
        this.f26600c = -1;
    }

    public abstract void U(ArrayList arrayList, k61 k61Var);

    public abstract CharSequence V();

    public abstract void W(w51 w51Var, View view);

    public abstract boolean X(w51 w51Var, View view);

    @Override
    public View createView(Context context) {
        hg.k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 13));
        hg.q1 q1Var = new hg.q1(context, null, 1);
        this.f26599b = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        m61 m61Var = new m61(this, this, new d(this, 22), new l61(this), new l61(this));
        this.f26598a = m61Var;
        this.f26599b.addView(m61Var, w7.y5.c(-1.0f, -1));
        hg.q1 q1Var2 = this.f26599b;
        this.fragmentView = q1Var2;
        return q1Var2;
    }
}
