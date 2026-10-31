package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class r51 extends org.telegram.ui.ActionBar.k2 {
    public ii f29837a;
    public ag.t2 f29838b;
    public int f29839c;
    public int d;

    public r51() {
        super(null);
        this.f29839c = -1;
    }

    public abstract void Y(ArrayList arrayList, p51 p51Var);

    public abstract CharSequence Z();

    public abstract void a0(a51 a51Var, View view);

    public abstract boolean b0(a51 a51Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.ar arVar = new org.telegram.ui.ar(this, 9);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
            this.simpleActionBar.setTitle(Z());
            this.simpleActionBar.setActionBarMenuOnItemClick(arVar);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(Z());
            this.actionBar.setActionBarMenuOnItemClick(arVar);
        }
        this.f29838b = new ag.t2(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, this.f29838b, null);
        }
        ii iiVar = new ii(this, this, new d(this, 22), new q51(this), new q51(this));
        this.f29837a = iiVar;
        this.f29838b.addView(iiVar, w7.b6.c(-1.0f, -1));
        ag.t2 t2Var = this.f29838b;
        this.fragmentView = t2Var;
        return t2Var;
    }
}
