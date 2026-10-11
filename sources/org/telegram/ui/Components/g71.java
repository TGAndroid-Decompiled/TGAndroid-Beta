package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class g71 extends org.telegram.ui.ActionBar.m2 {
    public f71 f26675a;
    public int f26676b;
    public int f26677c;

    public g71() {
        super(null);
        this.f26676b = -1;
    }

    public abstract void U(ArrayList arrayList, d71 d71Var);

    public abstract CharSequence V();

    public abstract void W(q61 q61Var, View view);

    public abstract boolean X(q61 q61Var, View view);

    @Override
    public View createView(Context context) {
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 13));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20766a7, false));
        f71 f71Var = new f71(this, this, new d(this, 22), new e71(this), new e71(this));
        this.f26675a = f71Var;
        r1Var.addView(f71Var, w7.x5.d(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
