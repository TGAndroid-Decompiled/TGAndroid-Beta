package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class m61 extends org.telegram.ui.ActionBar.p2 {
    public l61 f25171a;
    public int f25172b;
    public int f25173c;

    public m61() {
        super(null);
        this.f25172b = -1;
    }

    public abstract void U(ArrayList arrayList, j61 j61Var);

    public abstract CharSequence V();

    public abstract void W(v51 v51Var, View view);

    public abstract boolean X(v51 v51Var, View view);

    @Override
    public View createView(Context context) {
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.vo(this, 13));
        gg.z1 z1Var = new gg.z1(context, null, 1);
        z1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        l61 l61Var = new l61(this, this, new e(this, 22), new k61(this), new k61(this));
        this.f25171a = l61Var;
        z1Var.addView(l61Var, w7.a6.c(-1.0f, -1));
        this.fragmentView = z1Var;
        return z1Var;
    }
}
