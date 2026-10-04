package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class x61 extends org.telegram.ui.ActionBar.n2 {
    public w61 f32724a;
    public hg.q1 f32725b;
    public int f32726c;
    public int d;

    public x61() {
        super(null);
        this.f32726c = -1;
    }

    public abstract void S(ArrayList arrayList, u61 u61Var);

    public abstract CharSequence T();

    public abstract void U(g61 g61Var, View view);

    public abstract boolean W(g61 g61Var, View view);

    @Override
    public View createView(Context context) {
        hg.k0.u(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(T());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.qo(this, 13));
        hg.q1 q1Var = new hg.q1(context, null, 1);
        this.f32725b = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20761a7, false));
        w61 w61Var = new w61(this, this, new d(this, 22), new v61(this), new v61(this));
        this.f32724a = w61Var;
        this.f32725b.addView(w61Var, w7.z5.c(-1.0f, -1));
        hg.q1 q1Var2 = this.f32725b;
        this.fragmentView = q1Var2;
        return q1Var2;
    }
}
