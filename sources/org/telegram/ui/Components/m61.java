package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class m61 extends org.telegram.ui.ActionBar.m2 {
    public l61 f26372a;
    public int f26373b;
    public int f26374c;

    public m61() {
        super(null);
        this.f26373b = -1;
    }

    public abstract void U(ArrayList arrayList, j61 j61Var);

    public abstract CharSequence V();

    public abstract void W(v51 v51Var, View view);

    public abstract boolean X(v51 v51Var, View view);

    @Override
    public View createView(Context context) {
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.oo(this, 13));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19004a7, false));
        l61 l61Var = new l61(this, this, new d(this, 22), new k61(this), new k61(this));
        this.f26372a = l61Var;
        r1Var.addView(l61Var, w7.y5.c(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
