package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class k71 extends org.telegram.ui.ActionBar.m2 {
    public j71 f27776a;
    public int f27777b;
    public int f27778c;

    public k71() {
        super(null);
        this.f27777b = -1;
    }

    public abstract void U(ArrayList arrayList, h71 h71Var);

    public abstract CharSequence V();

    public abstract void W(u61 u61Var, View view);

    public abstract boolean X(u61 u61Var, View view);

    @Override
    public View createView(Context context) {
        hg.c.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.lc(this, 14));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        j71 j71Var = new j71(this, this, new d(this, 22), new i71(this), new i71(this));
        this.f27776a = j71Var;
        r1Var.addView(j71Var, w7.w5.d(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
