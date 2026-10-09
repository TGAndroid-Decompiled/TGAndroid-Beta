package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class f71 extends org.telegram.ui.ActionBar.n2 {
    public e71 f26290a;
    public int f26291b;
    public int f26292c;

    public f71() {
        super(null);
        this.f26291b = -1;
    }

    public abstract void U(ArrayList arrayList, c71 c71Var);

    public abstract CharSequence V();

    public abstract void W(p61 p61Var, View view);

    public abstract boolean X(p61 p61Var, View view);

    @Override
    public View createView(Context context) {
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 13));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        e71 e71Var = new e71(this, this, new d(this, 22), new d71(this), new d71(this));
        this.f26290a = e71Var;
        r1Var.addView(e71Var, w7.x5.d(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
