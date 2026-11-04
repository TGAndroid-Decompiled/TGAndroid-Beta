package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public abstract class h41 extends org.telegram.ui.ActionBar.d2 {
    public ai.h4 f34298a;
    public lg.m1 f34299b;
    public int f34300c;
    public int d;

    public h41() {
        super(null);
        this.f34300c = -1;
    }

    public abstract void Z(ArrayList arrayList, f41 f41Var);

    public abstract CharSequence a0();

    public abstract void b0(r31 r31Var, View view);

    public abstract boolean c0(r31 r31Var, View view);

    @Override
    public View createView(Context context) {
        org.telegram.ui.o9 o9Var = new org.telegram.ui.o9(this, 19);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(o9Var);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(o9Var);
        }
        this.f34299b = new lg.m1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, this.f34299b, null);
        }
        ai.h4 h4Var = new ai.h4(this, this, new e(this, 22), new g41(this), new g41(this));
        this.f34298a = h4Var;
        this.f34299b.addView(h4Var, b8.mf.c(-1.0f, -1));
        lg.m1 m1Var = this.f34299b;
        this.fragmentView = m1Var;
        return m1Var;
    }
}
