package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class y51 extends org.telegram.ui.ActionBar.n2 {
    public x51 f30163a;
    public int f30164b;
    public int f30165c;

    public y51() {
        super(null);
        this.f30164b = -1;
    }

    public abstract void U(ArrayList arrayList, v51 v51Var);

    public abstract CharSequence V();

    public abstract void W(h51 h51Var, View view);

    public abstract boolean X(h51 h51Var, View view);

    @Override
    public View createView(Context context) {
        hg.c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.po(this, 13));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
        x51 x51Var = new x51(this, this, new d(this, 22), new w51(this), new w51(this));
        this.f30163a = x51Var;
        r1Var.addView(x51Var, w7.x5.c(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
