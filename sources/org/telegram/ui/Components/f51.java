package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

public abstract class f51 extends org.telegram.ui.ActionBar.n2 {

    public e51 f28261a;

    public int f28262b;

    public int f28263c;

    public f51() {
        super(null);
        this.f28262b = -1;
    }

    public abstract void U(ArrayList arrayList, b51 b51Var);

    public abstract CharSequence V();

    public abstract void W(n41 n41Var, View view);

    public abstract boolean X(n41 n41Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, 9));
        d51 d51Var = new d51(context, null, 0);
        d51Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        e51 e51Var = new e51(this, this, new d(this, 22), new c51(this), new c51(this));
        this.f28261a = e51Var;
        d51Var.addView(e51Var, h7.z5.c(-1.0f, -1));
        this.fragmentView = d51Var;
        return d51Var;
    }
}
